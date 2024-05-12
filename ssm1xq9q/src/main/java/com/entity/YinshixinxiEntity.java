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
 * 饮食信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
@TableName("yinshixinxi")
public class YinshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YinshixinxiEntity() {
		
	}
	
	public YinshixinxiEntity(T t) {
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
	 * 饮食编号
	 */
					
	private String yinshibianhao;
	
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
	 * 设置：饮食编号
	 */
	public void setYinshibianhao(String yinshibianhao) {
		this.yinshibianhao = yinshibianhao;
	}
	/**
	 * 获取：饮食编号
	 */
	public String getYinshibianhao() {
		return yinshibianhao;
	}
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
