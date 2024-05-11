package com.dao;

import com.entity.ZaotangfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaotangfenleiVO;
import com.entity.view.ZaotangfenleiView;


/**
 * 澡堂分类
 * 
 * @author 
 * @email 
 * @date 2022-02-16 09:27:18
 */
public interface ZaotangfenleiDao extends BaseMapper<ZaotangfenleiEntity> {
	
	List<ZaotangfenleiVO> selectListVO(@Param("ew") Wrapper<ZaotangfenleiEntity> wrapper);
	
	ZaotangfenleiVO selectVO(@Param("ew") Wrapper<ZaotangfenleiEntity> wrapper);
	
	List<ZaotangfenleiView> selectListView(@Param("ew") Wrapper<ZaotangfenleiEntity> wrapper);

	List<ZaotangfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZaotangfenleiEntity> wrapper);
	
	ZaotangfenleiView selectView(@Param("ew") Wrapper<ZaotangfenleiEntity> wrapper);
	

}
