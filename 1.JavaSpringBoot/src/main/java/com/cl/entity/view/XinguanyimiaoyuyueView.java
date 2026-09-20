package com.cl.entity.view;

import com.cl.entity.XinguanyimiaoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 新冠疫苗预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
@TableName("xinguanyimiaoyuyue")
public class XinguanyimiaoyuyueView  extends XinguanyimiaoyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinguanyimiaoyuyueView(){
	}
 
 	public XinguanyimiaoyuyueView(XinguanyimiaoyuyueEntity xinguanyimiaoyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, xinguanyimiaoyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
