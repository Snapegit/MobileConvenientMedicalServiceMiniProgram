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

import com.cl.entity.TijianfenleiEntity;
import com.cl.entity.view.TijianfenleiView;

import com.cl.service.TijianfenleiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 体检分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
@RestController
@RequestMapping("/tijianfenlei")
public class TijianfenleiController {
    @Autowired
    private TijianfenleiService tijianfenleiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TijianfenleiEntity tijianfenlei,
		HttpServletRequest request){
        EntityWrapper<TijianfenleiEntity> ew = new EntityWrapper<TijianfenleiEntity>();

		PageUtils page = tijianfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tijianfenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TijianfenleiEntity tijianfenlei, 
		HttpServletRequest request){
        EntityWrapper<TijianfenleiEntity> ew = new EntityWrapper<TijianfenleiEntity>();

		PageUtils page = tijianfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tijianfenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TijianfenleiEntity tijianfenlei){
       	EntityWrapper<TijianfenleiEntity> ew = new EntityWrapper<TijianfenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tijianfenlei, "tijianfenlei")); 
        return R.ok().put("data", tijianfenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TijianfenleiEntity tijianfenlei){
        EntityWrapper< TijianfenleiEntity> ew = new EntityWrapper< TijianfenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tijianfenlei, "tijianfenlei")); 
		TijianfenleiView tijianfenleiView =  tijianfenleiService.selectView(ew);
		return R.ok("查询体检分类成功").put("data", tijianfenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TijianfenleiEntity tijianfenlei = tijianfenleiService.selectById(id);
		tijianfenlei = tijianfenleiService.selectView(new EntityWrapper<TijianfenleiEntity>().eq("id", id));
        return R.ok().put("data", tijianfenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TijianfenleiEntity tijianfenlei = tijianfenleiService.selectById(id);
		tijianfenlei = tijianfenleiService.selectView(new EntityWrapper<TijianfenleiEntity>().eq("id", id));
        return R.ok().put("data", tijianfenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TijianfenleiEntity tijianfenlei, HttpServletRequest request){
    	tijianfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tijianfenlei);
        tijianfenleiService.insert(tijianfenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TijianfenleiEntity tijianfenlei, HttpServletRequest request){
    	tijianfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tijianfenlei);
        tijianfenleiService.insert(tijianfenlei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TijianfenleiEntity tijianfenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tijianfenlei);
        tijianfenleiService.updateById(tijianfenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tijianfenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
