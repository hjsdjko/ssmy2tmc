package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZaotangfenleiDao;
import com.entity.ZaotangfenleiEntity;
import com.service.ZaotangfenleiService;
import com.entity.vo.ZaotangfenleiVO;
import com.entity.view.ZaotangfenleiView;

@Service("zaotangfenleiService")
public class ZaotangfenleiServiceImpl extends ServiceImpl<ZaotangfenleiDao, ZaotangfenleiEntity> implements ZaotangfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaotangfenleiEntity> page = this.selectPage(
                new Query<ZaotangfenleiEntity>(params).getPage(),
                new EntityWrapper<ZaotangfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaotangfenleiEntity> wrapper) {
		  Page<ZaotangfenleiView> page =new Query<ZaotangfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaotangfenleiVO> selectListVO(Wrapper<ZaotangfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaotangfenleiVO selectVO(Wrapper<ZaotangfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaotangfenleiView> selectListView(Wrapper<ZaotangfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaotangfenleiView selectView(Wrapper<ZaotangfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
