package com.entity.view;

import com.entity.ZaotangyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 澡堂预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-16 09:27:18
 */
@TableName("zaotangyuyue")
public class ZaotangyuyueView  extends ZaotangyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaotangyuyueView(){
	}
 
 	public ZaotangyuyueView(ZaotangyuyueEntity zaotangyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, zaotangyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
