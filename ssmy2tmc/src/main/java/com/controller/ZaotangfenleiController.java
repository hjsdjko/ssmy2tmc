package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZaotangfenleiEntity;
import com.entity.view.ZaotangfenleiView;

import com.service.ZaotangfenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 澡堂分类
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-16 09:27:18
 */
@RestController
@RequestMapping("/zaotangfenlei")
public class ZaotangfenleiController {
    @Autowired
    private ZaotangfenleiService zaotangfenleiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZaotangfenleiEntity zaotangfenlei, 
		HttpServletRequest request){

        EntityWrapper<ZaotangfenleiEntity> ew = new EntityWrapper<ZaotangfenleiEntity>();
		PageUtils page = zaotangfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaotangfenlei), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZaotangfenleiEntity zaotangfenlei, 
		HttpServletRequest request){
        EntityWrapper<ZaotangfenleiEntity> ew = new EntityWrapper<ZaotangfenleiEntity>();
		PageUtils page = zaotangfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaotangfenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZaotangfenleiEntity zaotangfenlei){
       	EntityWrapper<ZaotangfenleiEntity> ew = new EntityWrapper<ZaotangfenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zaotangfenlei, "zaotangfenlei")); 
        return R.ok().put("data", zaotangfenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZaotangfenleiEntity zaotangfenlei){
        EntityWrapper< ZaotangfenleiEntity> ew = new EntityWrapper< ZaotangfenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zaotangfenlei, "zaotangfenlei")); 
		ZaotangfenleiView zaotangfenleiView =  zaotangfenleiService.selectView(ew);
		return R.ok("查询澡堂分类成功").put("data", zaotangfenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZaotangfenleiEntity zaotangfenlei = zaotangfenleiService.selectById(id);
        return R.ok().put("data", zaotangfenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZaotangfenleiEntity zaotangfenlei = zaotangfenleiService.selectById(id);
        return R.ok().put("data", zaotangfenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZaotangfenleiEntity zaotangfenlei, HttpServletRequest request){
    	zaotangfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaotangfenlei);

        zaotangfenleiService.insert(zaotangfenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZaotangfenleiEntity zaotangfenlei, HttpServletRequest request){
    	zaotangfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaotangfenlei);

        zaotangfenleiService.insert(zaotangfenlei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZaotangfenleiEntity zaotangfenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zaotangfenlei);
        zaotangfenleiService.updateById(zaotangfenlei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zaotangfenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZaotangfenleiEntity> wrapper = new EntityWrapper<ZaotangfenleiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = zaotangfenleiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
