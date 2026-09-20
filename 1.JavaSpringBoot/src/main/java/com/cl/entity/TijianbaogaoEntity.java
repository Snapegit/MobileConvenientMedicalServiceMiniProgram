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
 * 体检报告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
@TableName("tijianbaogao")
public class TijianbaogaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TijianbaogaoEntity() {
		
	}
	
	public TijianbaogaoEntity(T t) {
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
	 * 体检报告
	 */
					
	private String tijianbaogao;
	
	/**
	 * 报告时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date baogaoshijian;
	
	/**
	 * 体检说明
	 */
					
	private String tijianshuoming;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 体检结果
	 */
					
	private String tijianjieguo;
	
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
	 * 设置：体检报告
	 */
	public void setTijianbaogao(String tijianbaogao) {
		this.tijianbaogao = tijianbaogao;
	}
	/**
	 * 获取：体检报告
	 */
	public String getTijianbaogao() {
		return tijianbaogao;
	}
	/**
	 * 设置：报告时间
	 */
	public void setBaogaoshijian(Date baogaoshijian) {
		this.baogaoshijian = baogaoshijian;
	}
	/**
	 * 获取：报告时间
	 */
	public Date getBaogaoshijian() {
		return baogaoshijian;
	}
	/**
	 * 设置：体检说明
	 */
	public void setTijianshuoming(String tijianshuoming) {
		this.tijianshuoming = tijianshuoming;
	}
	/**
	 * 获取：体检说明
	 */
	public String getTijianshuoming() {
		return tijianshuoming;
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
	 * 设置：体检结果
	 */
	public void setTijianjieguo(String tijianjieguo) {
		this.tijianjieguo = tijianjieguo;
	}
	/**
	 * 获取：体检结果
	 */
	public String getTijianjieguo() {
		return tijianjieguo;
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
