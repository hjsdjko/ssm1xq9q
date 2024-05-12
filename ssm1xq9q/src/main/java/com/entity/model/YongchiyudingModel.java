package com.entity.model;

import com.entity.YongchiyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 泳池预定
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-16 14:40:34
 */
public class YongchiyudingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 预定时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yudingshijian;
		
	/**
	 * 会员账号
	 */
	
	private String huiyuanzhanghao;
		
	/**
	 * 会员姓名
	 */
	
	private String huiyuanxingming;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：预定时间
	 */
	 
	public void setYudingshijian(Date yudingshijian) {
		this.yudingshijian = yudingshijian;
	}
	
	/**
	 * 获取：预定时间
	 */
	public Date getYudingshijian() {
		return yudingshijian;
	}
				
	
	/**
	 * 设置：会员账号
	 */
	 
	public void setHuiyuanzhanghao(String huiyuanzhanghao) {
		this.huiyuanzhanghao = huiyuanzhanghao;
	}
	
	/**
	 * 获取：会员账号
	 */
	public String getHuiyuanzhanghao() {
		return huiyuanzhanghao;
	}
				
	
	/**
	 * 设置：会员姓名
	 */
	 
	public void setHuiyuanxingming(String huiyuanxingming) {
		this.huiyuanxingming = huiyuanxingming;
	}
	
	/**
	 * 获取：会员姓名
	 */
	public String getHuiyuanxingming() {
		return huiyuanxingming;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}