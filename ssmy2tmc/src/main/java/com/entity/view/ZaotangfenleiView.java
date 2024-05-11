package com.entity.view;

import com.entity.ZaotangfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 澡堂分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-16 09:27:18
 */
@TableName("zaotangfenlei")
public class ZaotangfenleiView  extends ZaotangfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaotangfenleiView(){
	}
 
 	public ZaotangfenleiView(ZaotangfenleiEntity zaotangfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, zaotangfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
