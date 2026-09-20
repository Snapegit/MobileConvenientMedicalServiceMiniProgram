package com.cl.entity.view;

import com.cl.entity.JiankangtijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 健康体检
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
@TableName("jiankangtijian")
public class JiankangtijianView  extends JiankangtijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangtijianView(){
	}
 
 	public JiankangtijianView(JiankangtijianEntity jiankangtijianEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangtijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
