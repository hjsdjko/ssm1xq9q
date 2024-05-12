package com.entity.view;

import com.entity.YongchileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 泳池类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
@TableName("yongchileixing")
public class YongchileixingView  extends YongchileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YongchileixingView(){
	}
 
 	public YongchileixingView(YongchileixingEntity yongchileixingEntity){
 	try {
			BeanUtils.copyProperties(this, yongchileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
