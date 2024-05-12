package com.entity.model;

import com.entity.YongchixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 泳池信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
public class YongchixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 场馆名称
	 */
	
	private String changguanmingcheng;
		
	/**
	 * 泳池名称
	 */
	
	private String yongchimingcheng;
		
	/**
	 * 泳池类型
	 */
	
	private String yongchileixing;
		
	/**
	 * 泳池图片
	 */
	
	private String yongchitupian;
		
	/**
	 * 泳池价格
	 */
	
	private Float yongchijiage;
		
	/**
	 * 泳池位置
	 */
	
	private String yongchiweizhi;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 泳池详情
	 */
	
	private String yongchixiangqing;
				
	
	/**
	 * 设置：场馆名称
	 */
	 
	public void setChangguanmingcheng(String changguanmingcheng) {
		this.changguanmingcheng = changguanmingcheng;
	}
	
	/**
	 * 获取：场馆名称
	 */
	public String getChangguanmingcheng() {
		return changguanmingcheng;
	}
				
	
	/**
	 * 设置：泳池名称
	 */
	 
	public void setYongchimingcheng(String yongchimingcheng) {
		this.yongchimingcheng = yongchimingcheng;
	}
	
	/**
	 * 获取：泳池名称
	 */
	public String getYongchimingcheng() {
		return yongchimingcheng;
	}
				
	
	/**
	 * 设置：泳池类型
	 */
	 
	public void setYongchileixing(String yongchileixing) {
		this.yongchileixing = yongchileixing;
	}
	
	/**
	 * 获取：泳池类型
	 */
	public String getYongchileixing() {
		return yongchileixing;
	}
				
	
	/**
	 * 设置：泳池图片
	 */
	 
	public void setYongchitupian(String yongchitupian) {
		this.yongchitupian = yongchitupian;
	}
	
	/**
	 * 获取：泳池图片
	 */
	public String getYongchitupian() {
		return yongchitupian;
	}
				
	
	/**
	 * 设置：泳池价格
	 */
	 
	public void setYongchijiage(Float yongchijiage) {
		this.yongchijiage = yongchijiage;
	}
	
	/**
	 * 获取：泳池价格
	 */
	public Float getYongchijiage() {
		return yongchijiage;
	}
				
	
	/**
	 * 设置：泳池位置
	 */
	 
	public void setYongchiweizhi(String yongchiweizhi) {
		this.yongchiweizhi = yongchiweizhi;
	}
	
	/**
	 * 获取：泳池位置
	 */
	public String getYongchiweizhi() {
		return yongchiweizhi;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：泳池详情
	 */
	 
	public void setYongchixiangqing(String yongchixiangqing) {
		this.yongchixiangqing = yongchixiangqing;
	}
	
	/**
	 * 获取：泳池详情
	 */
	public String getYongchixiangqing() {
		return yongchixiangqing;
	}
			
}
