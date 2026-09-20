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
 * 健康体检
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
@TableName("jiankangtijian")
public class JiankangtijianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangtijianEntity() {
		
	}
	
	public JiankangtijianEntity(T t) {
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
	 * 体检项目
	 */
					
	private String tijianxiangmu;
	
	/**
	 * 体检分类
	 */
					
	private String tijianfenlei;
	
	/**
	 * 体检图片
	 */
					
	private String tijiantupian;
	
	/**
	 * 体检地点
	 */
					
	private String tijiandidian;
	
	/**
	 * 体检费用
	 */
					
	private Double tijianfeiyong;
	
	/**
	 * 体检流程
	 */
					
	private String tijianliucheng;
	
	/**
	 * 医生账号
	 */
					
	private String yishengzhanghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	
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
	 * 设置：体检项目
	 */
	public void setTijianxiangmu(String tijianxiangmu) {
		this.tijianxiangmu = tijianxiangmu;
	}
	/**
	 * 获取：体检项目
	 */
	public String getTijianxiangmu() {
		return tijianxiangmu;
	}
	/**
	 * 设置：体检分类
	 */
	public void setTijianfenlei(String tijianfenlei) {
		this.tijianfenlei = tijianfenlei;
	}
	/**
	 * 获取：体检分类
	 */
	public String getTijianfenlei() {
		return tijianfenlei;
	}
	/**
	 * 设置：体检图片
	 */
	public void setTijiantupian(String tijiantupian) {
		this.tijiantupian = tijiantupian;
	}
	/**
	 * 获取：体检图片
	 */
	public String getTijiantupian() {
		return tijiantupian;
	}
	/**
	 * 设置：体检地点
	 */
	public void setTijiandidian(String tijiandidian) {
		this.tijiandidian = tijiandidian;
	}
	/**
	 * 获取：体检地点
	 */
	public String getTijiandidian() {
		return tijiandidian;
	}
	/**
	 * 设置：体检费用
	 */
	public void setTijianfeiyong(Double tijianfeiyong) {
		this.tijianfeiyong = tijianfeiyong;
	}
	/**
	 * 获取：体检费用
	 */
	public Double getTijianfeiyong() {
		return tijianfeiyong;
	}
	/**
	 * 设置：体检流程
	 */
	public void setTijianliucheng(String tijianliucheng) {
		this.tijianliucheng = tijianliucheng;
	}
	/**
	 * 获取：体检流程
	 */
	public String getTijianliucheng() {
		return tijianliucheng;
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

}
