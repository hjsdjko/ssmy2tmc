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


import com.dao.ZaotangyuyueDao;
import com.entity.ZaotangyuyueEntity;
import com.service.ZaotangyuyueService;
import com.entity.vo.ZaotangyuyueVO;
import com.entity.view.ZaotangyuyueView;

@Service("zaotangyuyueService")
public class ZaotangyuyueServiceImpl extends ServiceImpl<ZaotangyuyueDao, ZaotangyuyueEntity> implements ZaotangyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaotangyuyueEntity> page = this.selectPage(
                new Query<ZaotangyuyueEntity>(params).getPage(),
                new EntityWrapper<ZaotangyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaotangyuyueEntity> wrapper) {
		  Page<ZaotangyuyueView> page =new Query<ZaotangyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaotangyuyueVO> selectListVO(Wrapper<ZaotangyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaotangyuyueVO selectVO(Wrapper<ZaotangyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaotangyuyueView> selectListView(Wrapper<ZaotangyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaotangyuyueView selectView(Wrapper<ZaotangyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
