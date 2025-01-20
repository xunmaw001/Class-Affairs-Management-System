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
 * 班费通知
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
@TableName("banfeitongzhi")
public class BanfeitongzhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BanfeitongzhiEntity() {
		
	}
	
	public BanfeitongzhiEntity(T t) {
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
	 * 学号
	 */
					
	private String xuehao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tongzhiriqi;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
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
