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

import com.cl.entity.XinguanyimiaoEntity;
import com.cl.entity.view.XinguanyimiaoView;

import com.cl.service.XinguanyimiaoService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 新冠疫苗
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
@RestController
@RequestMapping("/xinguanyimiao")
public class XinguanyimiaoController {
    @Autowired
    private XinguanyimiaoService xinguanyimiaoService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinguanyimiaoEntity xinguanyimiao,
		HttpServletRequest request){
        EntityWrapper<XinguanyimiaoEntity> ew = new EntityWrapper<XinguanyimiaoEntity>();

		PageUtils page = xinguanyimiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinguanyimiao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinguanyimiaoEntity xinguanyimiao, 
		HttpServletRequest request){
        EntityWrapper<XinguanyimiaoEntity> ew = new EntityWrapper<XinguanyimiaoEntity>();

		PageUtils page = xinguanyimiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinguanyimiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinguanyimiaoEntity xinguanyimiao){
       	EntityWrapper<XinguanyimiaoEntity> ew = new EntityWrapper<XinguanyimiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinguanyimiao, "xinguanyimiao")); 
        return R.ok().put("data", xinguanyimiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinguanyimiaoEntity xinguanyimiao){
        EntityWrapper< XinguanyimiaoEntity> ew = new EntityWrapper< XinguanyimiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinguanyimiao, "xinguanyimiao")); 
		XinguanyimiaoView xinguanyimiaoView =  xinguanyimiaoService.selectView(ew);
		return R.ok("查询新冠疫苗成功").put("data", xinguanyimiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XinguanyimiaoEntity xinguanyimiao = xinguanyimiaoService.selectById(id);
		xinguanyimiao = xinguanyimiaoService.selectView(new EntityWrapper<XinguanyimiaoEntity>().eq("id", id));
        return R.ok().put("data", xinguanyimiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XinguanyimiaoEntity xinguanyimiao = xinguanyimiaoService.selectById(id);
		xinguanyimiao = xinguanyimiaoService.selectView(new EntityWrapper<XinguanyimiaoEntity>().eq("id", id));
        return R.ok().put("data", xinguanyimiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinguanyimiaoEntity xinguanyimiao, HttpServletRequest request){
    	xinguanyimiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinguanyimiao);
        xinguanyimiaoService.insert(xinguanyimiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinguanyimiaoEntity xinguanyimiao, HttpServletRequest request){
    	xinguanyimiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinguanyimiao);
        xinguanyimiaoService.insert(xinguanyimiao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XinguanyimiaoEntity xinguanyimiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinguanyimiao);
        xinguanyimiaoService.updateById(xinguanyimiao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinguanyimiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
