package com.entity.model;

import com.entity.BanfeitongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 班费通知
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public class BanfeitongzhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 班费
	 */
	
	private Float banfei;
		
	/**
	 * 收缴原因
	 */
	
	private String shoujiaoyuanyin;
		
	/**
	 * 班委账号
	 */
	
	private String banweizhanghao;
		
	/**
	 * 班委姓名
	 */
	
	private String banweixingming;
		
	/**
	 * 通知日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongzhiriqi;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：班费
	 */
	 
	public void setBanfei(Float banfei) {
		this.banfei = banfei;
	}
	
	/**
	 * 获取：班费
	 */
	public Float getBanfei() {
		return banfei;
	}
				
	
	/**
	 * 设置：收缴原因
	 */
	 
	public void setShoujiaoyuanyin(String shoujiaoyuanyin) {
		this.shoujiaoyuanyin = shoujiaoyuanyin;
	}
	
	/**
	 * 获取：收缴原因
	 */
	public String getShoujiaoyuanyin() {
		return shoujiaoyuanyin;
	}
				
	
	/**
	 * 设置：班委账号
	 */
	 
	public void setBanweizhanghao(String banweizhanghao) {
		this.banweizhanghao = banweizhanghao;
	}
	
	/**
	 * 获取：班委账号
	 */
	public String getBanweizhanghao() {
		return banweizhanghao;
	}
				
	
	/**
	 * 设置：班委姓名
	 */
	 
	public void setBanweixingming(String banweixingming) {
		this.banweixingming = banweixingming;
	}
	
	/**
	 * 获取：班委姓名
	 */
	public String getBanweixingming() {
		return banweixingming;
	}
				
	
	/**
	 * 设置：通知日期
	 */
	 
	public void setTongzhiriqi(Date tongzhiriqi) {
		this.tongzhiriqi = tongzhiriqi;
	}
	
	/**
	 * 获取：通知日期
	 */
	public Date getTongzhiriqi() {
		return tongzhiriqi;
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
			
}
