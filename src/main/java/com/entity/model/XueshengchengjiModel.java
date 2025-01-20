package com.entity.model;

import com.entity.XueshengchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生成绩
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public class XueshengchengjiModel  implements Serializable {
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
	 * 成绩
	 */
	
	private String chengji;
		
	/**
	 * 评语
	 */
	
	private String pingyu;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 班委账号
	 */
	
	private String banweizhanghao;
		
	/**
	 * 班委姓名
	 */
	
	private String banweixingming;
				
	
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
	 * 设置：成绩
	 */
	 
	public void setChengji(String chengji) {
		this.chengji = chengji;
	}
	
	/**
	 * 获取：成绩
	 */
	public String getChengji() {
		return chengji;
	}
				
	
	/**
	 * 设置：评语
	 */
	 
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
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
			
}
