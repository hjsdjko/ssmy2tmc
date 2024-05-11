package com.dao;

import com.entity.ZaotangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaotangVO;
import com.entity.view.ZaotangView;


/**
 * 澡堂
 * 
 * @author 
 * @email 
 * @date 2022-02-16 09:27:18
 */
public interface ZaotangDao extends BaseMapper<ZaotangEntity> {
	
	List<ZaotangVO> selectListVO(@Param("ew") Wrapper<ZaotangEntity> wrapper);
	
	ZaotangVO selectVO(@Param("ew") Wrapper<ZaotangEntity> wrapper);
	
	List<ZaotangView> selectListView(@Param("ew") Wrapper<ZaotangEntity> wrapper);

	List<ZaotangView> selectListView(Pagination page,@Param("ew") Wrapper<ZaotangEntity> wrapper);
	
	ZaotangView selectView(@Param("ew") Wrapper<ZaotangEntity> wrapper);
	

}
