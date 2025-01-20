package com.entity.view;

import com.entity.DangyuanpeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 党员培训
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
@TableName("dangyuanpeixun")
public class DangyuanpeixunView  extends DangyuanpeixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DangyuanpeixunView(){
	}
 
 	public DangyuanpeixunView(DangyuanpeixunEntity dangyuanpeixunEntity){
 	try {
			BeanUtils.copyProperties(this, dangyuanpeixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
