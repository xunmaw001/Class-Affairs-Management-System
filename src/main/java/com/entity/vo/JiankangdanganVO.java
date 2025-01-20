package com.entity.vo;

import com.entity.JiankangdanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 健康档案
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public class JiankangdanganVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 慢性急病
	 */
	
	private String manxingjibing;
		
	/**
	 * 家族病史
	 */
	
	private String jiazubingshi;
		
	/**
	 * 药物过敏
	 */
	
	private String yaowuguomin;
		
	/**
	 * 重大病史
	 */
	
	private String zhongdabingshi;
		
	/**
	 * 日常饮食
	 */
	
	private String richangyinshi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：慢性急病
	 */
	 
	public void setManxingjibing(String manxingjibing) {
		this.manxingjibing = manxingjibing;
	}
	
	/**
	 * 获取：慢性急病
	 */
	public String getManxingjibing() {
		return manxingjibing;
	}
				
	
	/**
	 * 设置：家族病史
	 */
	 
	public void setJiazubingshi(String jiazubingshi) {
		this.jiazubingshi = jiazubingshi;
	}
	
	/**
	 * 获取：家族病史
	 */
	public String getJiazubingshi() {
		return jiazubingshi;
	}
				
	
	/**
	 * 设置：药物过敏
	 */
	 
	public void setYaowuguomin(String yaowuguomin) {
		this.yaowuguomin = yaowuguomin;
	}
	
	/**
	 * 获取：药物过敏
	 */
	public String getYaowuguomin() {
		return yaowuguomin;
	}
				
	
	/**
	 * 设置：重大病史
	 */
	 
	public void setZhongdabingshi(String zhongdabingshi) {
		this.zhongdabingshi = zhongdabingshi;
	}
	
	/**
	 * 获取：重大病史
	 */
	public String getZhongdabingshi() {
		return zhongdabingshi;
	}
				
	
	/**
	 * 设置：日常饮食
	 */
	 
	public void setRichangyinshi(String richangyinshi) {
		this.richangyinshi = richangyinshi;
	}
	
	/**
	 * 获取：日常饮食
	 */
	public String getRichangyinshi() {
		return richangyinshi;
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
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
