package com.entity.view;

import com.entity.DiscussbanhuizuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班会组织评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
@TableName("discussbanhuizuzhi")
public class DiscussbanhuizuzhiView  extends DiscussbanhuizuzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbanhuizuzhiView(){
	}
 
 	public DiscussbanhuizuzhiView(DiscussbanhuizuzhiEntity discussbanhuizuzhiEntity){
 	try {
			BeanUtils.copyProperties(this, discussbanhuizuzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
