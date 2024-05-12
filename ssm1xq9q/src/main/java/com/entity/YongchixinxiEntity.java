package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 泳池信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
@TableName("yongchixinxi")
public class YongchixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YongchixinxiEntity() {
		
	}
	
	public YongchixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 泳池编号
	 */
					
	private String yongchibianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 泳池详情
	 */
					
	private String yongchixiangqing;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：泳池编号
	 */
	public void setYongchibianhao(String yongchibianhao) {
		this.yongchibianhao = yongchibianhao;
	}
	/**
	 * 获取：泳池编号
	 */
	public String getYongchibianhao() {
		return yongchibianhao;
	}
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
