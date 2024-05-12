package com.entity.model;

import com.entity.YinshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 饮食信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
public class YinshixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 饮食名称
	 */
	
	private String yinshimingcheng;
		
	/**
	 * 饮食类型
	 */
	
	private String yinshileixing;
		
	/**
	 * 饮食图片
	 */
	
	private String yinshitupian;
		
	/**
	 * 价格
	 */
	
	private Float jiage;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 营业时间
	 */
	
	private String yingyeshijian;
		
	/**
	 * 饮食详情
	 */
	
	private String yinshixiangqing;
				
	
	/**
	 * 设置：饮食名称
	 */
	 
	public void setYinshimingcheng(String yinshimingcheng) {
		this.yinshimingcheng = yinshimingcheng;
	}
	
	/**
	 * 获取：饮食名称
	 */
	public String getYinshimingcheng() {
		return yinshimingcheng;
	}
				
	
	/**
	 * 设置：饮食类型
	 */
	 
	public void setYinshileixing(String yinshileixing) {
		this.yinshileixing = yinshileixing;
	}
	
	/**
	 * 获取：饮食类型
	 */
	public String getYinshileixing() {
		return yinshileixing;
	}
				
	
	/**
	 * 设置：饮食图片
	 */
	 
	public void setYinshitupian(String yinshitupian) {
		this.yinshitupian = yinshitupian;
	}
	
	/**
	 * 获取：饮食图片
	 */
	public String getYinshitupian() {
		return yinshitupian;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Float jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：营业时间
	 */
	 
	public void setYingyeshijian(String yingyeshijian) {
		this.yingyeshijian = yingyeshijian;
	}
	
	/**
	 * 获取：营业时间
	 */
	public String getYingyeshijian() {
		return yingyeshijian;
	}
				
	
	/**
	 * 设置：饮食详情
	 */
	 
	public void setYinshixiangqing(String yinshixiangqing) {
		this.yinshixiangqing = yinshixiangqing;
	}
	
	/**
	 * 获取：饮食详情
	 */
	public String getYinshixiangqing() {
		return yinshixiangqing;
	}
			
}
