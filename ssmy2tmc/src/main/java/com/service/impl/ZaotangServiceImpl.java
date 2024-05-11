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


import com.dao.ZaotangDao;
import com.entity.ZaotangEntity;
import com.service.ZaotangService;
import com.entity.vo.ZaotangVO;
import com.entity.view.ZaotangView;

@Service("zaotangService")
public class ZaotangServiceImpl extends ServiceImpl<ZaotangDao, ZaotangEntity> implements ZaotangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaotangEntity> page = this.selectPage(
                new Query<ZaotangEntity>(params).getPage(),
                new EntityWrapper<ZaotangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaotangEntity> wrapper) {
		  Page<ZaotangView> page =new Query<ZaotangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaotangVO> selectListVO(Wrapper<ZaotangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaotangVO selectVO(Wrapper<ZaotangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaotangView> selectListView(Wrapper<ZaotangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaotangView selectView(Wrapper<ZaotangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
