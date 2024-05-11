package com.entity.vo;

import com.entity.ZaotangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 澡堂
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-16 09:27:18
 */
public class ZaotangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 澡堂分类
	 */
	
	private String zaotangfenlei;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 费用
	 */
	
	private String feiyong;
		
	/**
	 * 容纳人数
	 */
	
	private String rongnarenshu;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
				
	
	/**
	 * 设置：澡堂分类
	 */
	 
	public void setZaotangfenlei(String zaotangfenlei) {
		this.zaotangfenlei = zaotangfenlei;
	}
	
	/**
	 * 获取：澡堂分类
	 */
	public String getZaotangfenlei() {
		return zaotangfenlei;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：费用
	 */
	 
	public void setFeiyong(String feiyong) {
		this.feiyong = feiyong;
	}
	
	/**
	 * 获取：费用
	 */
	public String getFeiyong() {
		return feiyong;
	}
				
	
	/**
	 * 设置：容纳人数
	 */
	 
	public void setRongnarenshu(String rongnarenshu) {
		this.rongnarenshu = rongnarenshu;
	}
	
	/**
	 * 获取：容纳人数
	 */
	public String getRongnarenshu() {
		return rongnarenshu;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
			
}
