package com.entity.vo;

import com.entity.ChangguanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 场馆信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
public class ChangguanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 场馆名称
	 */
	
	private String changguanmingcheng;
		
	/**
	 * 场馆类型
	 */
	
	private String changguanleixing;
		
	/**
	 * 场馆图片
	 */
	
	private String changguantupian;
		
	/**
	 * 场馆位置
	 */
	
	private String changguanweizhi;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 开放时间
	 */
	
	private String kaifangshijian;
		
	/**
	 * 交通路线
	 */
	
	private String jiaotongluxian;
		
	/**
	 * 场馆介绍
	 */
	
	private String changguanjieshao;
				
	
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
	 * 设置：场馆类型
	 */
	 
	public void setChangguanleixing(String changguanleixing) {
		this.changguanleixing = changguanleixing;
	}
	
	/**
	 * 获取：场馆类型
	 */
	public String getChangguanleixing() {
		return changguanleixing;
	}
				
	
	/**
	 * 设置：场馆图片
	 */
	 
	public void setChangguantupian(String changguantupian) {
		this.changguantupian = changguantupian;
	}
	
	/**
	 * 获取：场馆图片
	 */
	public String getChangguantupian() {
		return changguantupian;
	}
				
	
	/**
	 * 设置：场馆位置
	 */
	 
	public void setChangguanweizhi(String changguanweizhi) {
		this.changguanweizhi = changguanweizhi;
	}
	
	/**
	 * 获取：场馆位置
	 */
	public String getChangguanweizhi() {
		return changguanweizhi;
	}
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：开放时间
	 */
	 
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	
	/**
	 * 获取：开放时间
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
				
	
	/**
	 * 设置：交通路线
	 */
	 
	public void setJiaotongluxian(String jiaotongluxian) {
		this.jiaotongluxian = jiaotongluxian;
	}
	
	/**
	 * 获取：交通路线
	 */
	public String getJiaotongluxian() {
		return jiaotongluxian;
	}
				
	
	/**
	 * 设置：场馆介绍
	 */
	 
	public void setChangguanjieshao(String changguanjieshao) {
		this.changguanjieshao = changguanjieshao;
	}
	
	/**
	 * 获取：场馆介绍
	 */
	public String getChangguanjieshao() {
		return changguanjieshao;
	}
			
}
