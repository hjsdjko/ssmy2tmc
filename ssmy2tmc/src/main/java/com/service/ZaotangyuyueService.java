package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaotangyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaotangyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaotangyuyueView;


/**
 * 澡堂预约
 *
 * @author 
 * @email 
 * @date 2022-02-16 09:27:18
 */
public interface ZaotangyuyueService extends IService<ZaotangyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaotangyuyueVO> selectListVO(Wrapper<ZaotangyuyueEntity> wrapper);
   	
   	ZaotangyuyueVO selectVO(@Param("ew") Wrapper<ZaotangyuyueEntity> wrapper);
   	
   	List<ZaotangyuyueView> selectListView(Wrapper<ZaotangyuyueEntity> wrapper);
   	
   	ZaotangyuyueView selectView(@Param("ew") Wrapper<ZaotangyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaotangyuyueEntity> wrapper);
   	

}

