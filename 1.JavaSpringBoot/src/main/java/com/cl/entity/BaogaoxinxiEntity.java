package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 报告信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
@TableName("baogaoxinxi")
public class BaogaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaogaoxinxiEntity() {
		
	}
	
	public BaogaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 检查项目
	 */
					
	private String jianchaxiangmu;
	
	/**
	 * 检查报告
	 */
					
	private String jianchabaogao;
	
	/**
	 * 报告结果
	 */
					
	private String baogaojieguo;
	
	/**
	 * 报告简介
	 */
					
	private String baogaojianjie;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 医生账号
	 */
					
	private String yishengzhanghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：检查项目
	 */
	public void setJianchaxiangmu(String jianchaxiangmu) {
		this.jianchaxiangmu = jianchaxiangmu;
	}
	/**
	 * 获取：检查项目
	 */
	public String getJianchaxiangmu() {
		return jianchaxiangmu;
	}
	/**
	 * 设置：检查报告
	 */
	public void setJianchabaogao(String jianchabaogao) {
		this.jianchabaogao = jianchabaogao;
	}
	/**
	 * 获取：检查报告
	 */
	public String getJianchabaogao() {
		return jianchabaogao;
	}
	/**
	 * 设置：报告结果
	 */
	public void setBaogaojieguo(String baogaojieguo) {
		this.baogaojieguo = baogaojieguo;
	}
	/**
	 * 获取：报告结果
	 */
	public String getBaogaojieguo() {
		return baogaojieguo;
	}
	/**
	 * 设置：报告简介
	 */
	public void setBaogaojianjie(String baogaojianjie) {
		this.baogaojianjie = baogaojianjie;
	}
	/**
	 * 获取：报告简介
	 */
	public String getBaogaojianjie() {
		return baogaojianjie;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：医生账号
	 */
	public void setYishengzhanghao(String yishengzhanghao) {
		this.yishengzhanghao = yishengzhanghao;
	}
	/**
	 * 获取：医生账号
	 */
	public String getYishengzhanghao() {
		return yishengzhanghao;
	}
	/**
	 * 设置：医生姓名
	 */
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
