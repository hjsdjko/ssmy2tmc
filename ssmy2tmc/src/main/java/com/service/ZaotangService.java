package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaotangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaotangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaotangView;


/**
 * 澡堂
 *
 * @author 
 * @email 
 * @date 2022-02-16 09:27:18
 */
public interface ZaotangService extends IService<ZaotangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaotangVO> selectListVO(Wrapper<ZaotangEntity> wrapper);
   	
   	ZaotangVO selectVO(@Param("ew") Wrapper<ZaotangEntity> wrapper);
   	
   	List<ZaotangView> selectListView(Wrapper<ZaotangEntity> wrapper);
   	
   	ZaotangView selectView(@Param("ew") Wrapper<ZaotangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaotangEntity> wrapper);
   	

}

