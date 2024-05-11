package com.dao;

import com.entity.ZaotangyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaotangyuyueVO;
import com.entity.view.ZaotangyuyueView;


/**
 * 澡堂预约
 * 
 * @author 
 * @email 
 * @date 2022-02-16 09:27:18
 */
public interface ZaotangyuyueDao extends BaseMapper<ZaotangyuyueEntity> {
	
	List<ZaotangyuyueVO> selectListVO(@Param("ew") Wrapper<ZaotangyuyueEntity> wrapper);
	
	ZaotangyuyueVO selectVO(@Param("ew") Wrapper<ZaotangyuyueEntity> wrapper);
	
	List<ZaotangyuyueView> selectListView(@Param("ew") Wrapper<ZaotangyuyueEntity> wrapper);

	List<ZaotangyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ZaotangyuyueEntity> wrapper);
	
	ZaotangyuyueView selectView(@Param("ew") Wrapper<ZaotangyuyueEntity> wrapper);
	

}
