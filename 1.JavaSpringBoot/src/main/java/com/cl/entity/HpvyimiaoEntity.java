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
 * hpv疫苗
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
@TableName("hpvyimiao")
public class HpvyimiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HpvyimiaoEntity() {
		
	}
	
	public HpvyimiaoEntity(T t) {
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
	 * 疫苗编号
	 */
					
	private String yimiaobianhao;
	
	/**
	 * 疫苗名称
	 */
					
	private String yimiaomingcheng;
	
	/**
	 * 疫苗类型
	 */
					
	private String yimiaoleixing;
	
	/**
	 * 批次号
	 */
					
	private String picihao;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 生产日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shengchanriqi;
	
	/**
	 * 保质期
	 */
					
	private String baozhiqi;
	
	/**
	 * 生产厂商
	 */
					
	private String shengchanchangshang;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	/**
	 * 接种流程
	 */
					
	private String jiezhongliucheng;
	
	/**
	 * 副作用
	 */
					
	private String fuzuoyong;
	
	
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
	 * 设置：疫苗编号
	 */
	public void setYimiaobianhao(String yimiaobianhao) {
		this.yimiaobianhao = yimiaobianhao;
	}
	/**
	 * 获取：疫苗编号
	 */
	public String getYimiaobianhao() {
		return yimiaobianhao;
	}
	/**
	 * 设置：疫苗名称
	 */
	public void setYimiaomingcheng(String yimiaomingcheng) {
		this.yimiaomingcheng = yimiaomingcheng;
	}
	/**
	 * 获取：疫苗名称
	 */
	public String getYimiaomingcheng() {
		return yimiaomingcheng;
	}
	/**
	 * 设置：疫苗类型
	 */
	public void setYimiaoleixing(String yimiaoleixing) {
		this.yimiaoleixing = yimiaoleixing;
	}
	/**
	 * 获取：疫苗类型
	 */
	public String getYimiaoleixing() {
		return yimiaoleixing;
	}
	/**
	 * 设置：批次号
	 */
	public void setPicihao(String picihao) {
		this.picihao = picihao;
	}
	/**
	 * 获取：批次号
	 */
	public String getPicihao() {
		return picihao;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：生产日期
	 */
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	/**
	 * 获取：生产日期
	 */
	public Date getShengchanriqi() {
		return shengchanriqi;
	}
	/**
	 * 设置：保质期
	 */
	public void setBaozhiqi(String baozhiqi) {
		this.baozhiqi = baozhiqi;
	}
	/**
	 * 获取：保质期
	 */
	public String getBaozhiqi() {
		return baozhiqi;
	}
	/**
	 * 设置：生产厂商
	 */
	public void setShengchanchangshang(String shengchanchangshang) {
		this.shengchanchangshang = shengchanchangshang;
	}
	/**
	 * 获取：生产厂商
	 */
	public String getShengchanchangshang() {
		return shengchanchangshang;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
	/**
	 * 设置：接种流程
	 */
	public void setJiezhongliucheng(String jiezhongliucheng) {
		this.jiezhongliucheng = jiezhongliucheng;
	}
	/**
	 * 获取：接种流程
	 */
	public String getJiezhongliucheng() {
		return jiezhongliucheng;
	}
	/**
	 * 设置：副作用
	 */
	public void setFuzuoyong(String fuzuoyong) {
		this.fuzuoyong = fuzuoyong;
	}
	/**
	 * 获取：副作用
	 */
	public String getFuzuoyong() {
		return fuzuoyong;
	}

}
