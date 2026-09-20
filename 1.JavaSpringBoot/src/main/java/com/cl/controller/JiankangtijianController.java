package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.JiankangtijianEntity;
import com.cl.entity.view.JiankangtijianView;

import com.cl.service.JiankangtijianService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 健康体检
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
@RestController
@RequestMapping("/jiankangtijian")
public class JiankangtijianController {
    @Autowired
    private JiankangtijianService jiankangtijianService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiankangtijianEntity jiankangtijian,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			jiankangtijian.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiankangtijianEntity> ew = new EntityWrapper<JiankangtijianEntity>();

		PageUtils page = jiankangtijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangtijian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiankangtijianEntity jiankangtijian, 
		HttpServletRequest request){
        EntityWrapper<JiankangtijianEntity> ew = new EntityWrapper<JiankangtijianEntity>();

		PageUtils page = jiankangtijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangtijian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiankangtijianEntity jiankangtijian){
       	EntityWrapper<JiankangtijianEntity> ew = new EntityWrapper<JiankangtijianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiankangtijian, "jiankangtijian")); 
        return R.ok().put("data", jiankangtijianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiankangtijianEntity jiankangtijian){
        EntityWrapper< JiankangtijianEntity> ew = new EntityWrapper< JiankangtijianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiankangtijian, "jiankangtijian")); 
		JiankangtijianView jiankangtijianView =  jiankangtijianService.selectView(ew);
		return R.ok("查询健康体检成功").put("data", jiankangtijianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiankangtijianEntity jiankangtijian = jiankangtijianService.selectById(id);
		jiankangtijian = jiankangtijianService.selectView(new EntityWrapper<JiankangtijianEntity>().eq("id", id));
        return R.ok().put("data", jiankangtijian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiankangtijianEntity jiankangtijian = jiankangtijianService.selectById(id);
		jiankangtijian = jiankangtijianService.selectView(new EntityWrapper<JiankangtijianEntity>().eq("id", id));
        return R.ok().put("data", jiankangtijian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiankangtijianEntity jiankangtijian, HttpServletRequest request){
    	jiankangtijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiankangtijian);
        jiankangtijianService.insert(jiankangtijian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiankangtijianEntity jiankangtijian, HttpServletRequest request){
    	jiankangtijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiankangtijian);
        jiankangtijianService.insert(jiankangtijian);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiankangtijianEntity jiankangtijian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiankangtijian);
        jiankangtijianService.updateById(jiankangtijian);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiankangtijianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
