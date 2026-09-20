package com.cl.entity.view;

import com.cl.entity.JiankangrijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 健康日记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
@TableName("jiankangriji")
public class JiankangrijiView  extends JiankangrijiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangrijiView(){
	}
 
 	public JiankangrijiView(JiankangrijiEntity jiankangrijiEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangrijiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
