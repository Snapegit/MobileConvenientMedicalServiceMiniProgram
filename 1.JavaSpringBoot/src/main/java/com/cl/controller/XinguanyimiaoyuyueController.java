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

import com.cl.entity.XinguanyimiaoyuyueEntity;
import com.cl.entity.view.XinguanyimiaoyuyueView;

import com.cl.service.XinguanyimiaoyuyueService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 新冠疫苗预约
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
@RestController
@RequestMapping("/xinguanyimiaoyuyue")
public class XinguanyimiaoyuyueController {
    @Autowired
    private XinguanyimiaoyuyueService xinguanyimiaoyuyueService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinguanyimiaoyuyueEntity xinguanyimiaoyuyue,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			xinguanyimiaoyuyue.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XinguanyimiaoyuyueEntity> ew = new EntityWrapper<XinguanyimiaoyuyueEntity>();

		PageUtils page = xinguanyimiaoyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinguanyimiaoyuyue), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinguanyimiaoyuyueEntity xinguanyimiaoyuyue, 
		HttpServletRequest request){
        EntityWrapper<XinguanyimiaoyuyueEntity> ew = new EntityWrapper<XinguanyimiaoyuyueEntity>();

		PageUtils page = xinguanyimiaoyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinguanyimiaoyuyue), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinguanyimiaoyuyueEntity xinguanyimiaoyuyue){
       	EntityWrapper<XinguanyimiaoyuyueEntity> ew = new EntityWrapper<XinguanyimiaoyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinguanyimiaoyuyue, "xinguanyimiaoyuyue")); 
        return R.ok().put("data", xinguanyimiaoyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinguanyimiaoyuyueEntity xinguanyimiaoyuyue){
        EntityWrapper< XinguanyimiaoyuyueEntity> ew = new EntityWrapper< XinguanyimiaoyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinguanyimiaoyuyue, "xinguanyimiaoyuyue")); 
		XinguanyimiaoyuyueView xinguanyimiaoyuyueView =  xinguanyimiaoyuyueService.selectView(ew);
		return R.ok("查询新冠疫苗预约成功").put("data", xinguanyimiaoyuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XinguanyimiaoyuyueEntity xinguanyimiaoyuyue = xinguanyimiaoyuyueService.selectById(id);
		xinguanyimiaoyuyue = xinguanyimiaoyuyueService.selectView(new EntityWrapper<XinguanyimiaoyuyueEntity>().eq("id", id));
        return R.ok().put("data", xinguanyimiaoyuyue);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XinguanyimiaoyuyueEntity xinguanyimiaoyuyue = xinguanyimiaoyuyueService.selectById(id);
		xinguanyimiaoyuyue = xinguanyimiaoyuyueService.selectView(new EntityWrapper<XinguanyimiaoyuyueEntity>().eq("id", id));
        return R.ok().put("data", xinguanyimiaoyuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinguanyimiaoyuyueEntity xinguanyimiaoyuyue, HttpServletRequest request){
    	xinguanyimiaoyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinguanyimiaoyuyue);
        xinguanyimiaoyuyueService.insert(xinguanyimiaoyuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinguanyimiaoyuyueEntity xinguanyimiaoyuyue, HttpServletRequest request){
    	xinguanyimiaoyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinguanyimiaoyuyue);
        xinguanyimiaoyuyueService.insert(xinguanyimiaoyuyue);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XinguanyimiaoyuyueEntity xinguanyimiaoyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinguanyimiaoyuyue);
        xinguanyimiaoyuyueService.updateById(xinguanyimiaoyuyue);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinguanyimiaoyuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
