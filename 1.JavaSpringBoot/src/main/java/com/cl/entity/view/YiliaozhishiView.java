package com.cl.entity.view;

import com.cl.entity.YiliaozhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 医疗知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
@TableName("yiliaozhishi")
public class YiliaozhishiView  extends YiliaozhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiliaozhishiView(){
	}
 
 	public YiliaozhishiView(YiliaozhishiEntity yiliaozhishiEntity){
 	try {
			BeanUtils.copyProperties(this, yiliaozhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
