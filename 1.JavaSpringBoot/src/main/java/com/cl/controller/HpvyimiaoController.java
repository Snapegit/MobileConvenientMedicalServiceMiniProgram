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

import com.cl.entity.HpvyimiaoEntity;
import com.cl.entity.view.HpvyimiaoView;

import com.cl.service.HpvyimiaoService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * hpv疫苗
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
@RestController
@RequestMapping("/hpvyimiao")
public class HpvyimiaoController {
    @Autowired
    private HpvyimiaoService hpvyimiaoService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HpvyimiaoEntity hpvyimiao,
		HttpServletRequest request){
        EntityWrapper<HpvyimiaoEntity> ew = new EntityWrapper<HpvyimiaoEntity>();

		PageUtils page = hpvyimiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hpvyimiao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HpvyimiaoEntity hpvyimiao, 
		HttpServletRequest request){
        EntityWrapper<HpvyimiaoEntity> ew = new EntityWrapper<HpvyimiaoEntity>();

		PageUtils page = hpvyimiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hpvyimiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HpvyimiaoEntity hpvyimiao){
       	EntityWrapper<HpvyimiaoEntity> ew = new EntityWrapper<HpvyimiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( hpvyimiao, "hpvyimiao")); 
        return R.ok().put("data", hpvyimiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HpvyimiaoEntity hpvyimiao){
        EntityWrapper< HpvyimiaoEntity> ew = new EntityWrapper< HpvyimiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( hpvyimiao, "hpvyimiao")); 
		HpvyimiaoView hpvyimiaoView =  hpvyimiaoService.selectView(ew);
		return R.ok("查询hpv疫苗成功").put("data", hpvyimiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HpvyimiaoEntity hpvyimiao = hpvyimiaoService.selectById(id);
		hpvyimiao = hpvyimiaoService.selectView(new EntityWrapper<HpvyimiaoEntity>().eq("id", id));
        return R.ok().put("data", hpvyimiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HpvyimiaoEntity hpvyimiao = hpvyimiaoService.selectById(id);
		hpvyimiao = hpvyimiaoService.selectView(new EntityWrapper<HpvyimiaoEntity>().eq("id", id));
        return R.ok().put("data", hpvyimiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HpvyimiaoEntity hpvyimiao, HttpServletRequest request){
    	hpvyimiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hpvyimiao);
        hpvyimiaoService.insert(hpvyimiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HpvyimiaoEntity hpvyimiao, HttpServletRequest request){
    	hpvyimiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hpvyimiao);
        hpvyimiaoService.insert(hpvyimiao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HpvyimiaoEntity hpvyimiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(hpvyimiao);
        hpvyimiaoService.updateById(hpvyimiao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        hpvyimiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
