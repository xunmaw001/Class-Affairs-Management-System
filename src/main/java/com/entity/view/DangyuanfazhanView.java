package com.entity.view;

import com.entity.DangyuanfazhanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 党员发展
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
@TableName("dangyuanfazhan")
public class DangyuanfazhanView  extends DangyuanfazhanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DangyuanfazhanView(){
	}
 
 	public DangyuanfazhanView(DangyuanfazhanEntity dangyuanfazhanEntity){
 	try {
			BeanUtils.copyProperties(this, dangyuanfazhanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
