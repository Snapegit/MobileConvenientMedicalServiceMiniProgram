package com.cl.entity.view;

import com.cl.entity.HpvyimiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * hpv疫苗
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
@TableName("hpvyimiao")
public class HpvyimiaoView  extends HpvyimiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HpvyimiaoView(){
	}
 
 	public HpvyimiaoView(HpvyimiaoEntity hpvyimiaoEntity){
 	try {
			BeanUtils.copyProperties(this, hpvyimiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
