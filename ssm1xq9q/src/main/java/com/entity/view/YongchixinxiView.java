package com.entity.view;

import com.entity.YongchixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 泳池信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
@TableName("yongchixinxi")
public class YongchixinxiView  extends YongchixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YongchixinxiView(){
	}
 
 	public YongchixinxiView(YongchixinxiEntity yongchixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yongchixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
