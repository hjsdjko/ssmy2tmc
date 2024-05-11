package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaotangfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaotangfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaotangfenleiView;


/**
 * 澡堂分类
 *
 * @author 
 * @email 
 * @date 2022-02-16 09:27:18
 */
public interface ZaotangfenleiService extends IService<ZaotangfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaotangfenleiVO> selectListVO(Wrapper<ZaotangfenleiEntity> wrapper);
   	
   	ZaotangfenleiVO selectVO(@Param("ew") Wrapper<ZaotangfenleiEntity> wrapper);
   	
   	List<ZaotangfenleiView> selectListView(Wrapper<ZaotangfenleiEntity> wrapper);
   	
   	ZaotangfenleiView selectView(@Param("ew") Wrapper<ZaotangfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaotangfenleiEntity> wrapper);
   	

}

