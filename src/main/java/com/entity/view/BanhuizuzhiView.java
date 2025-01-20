package com.entity.view;

import com.entity.BanhuizuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班会组织
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
@TableName("banhuizuzhi")
public class BanhuizuzhiView  extends BanhuizuzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanhuizuzhiView(){
	}
 
 	public BanhuizuzhiView(BanhuizuzhiEntity banhuizuzhiEntity){
 	try {
			BeanUtils.copyProperties(this, banhuizuzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
