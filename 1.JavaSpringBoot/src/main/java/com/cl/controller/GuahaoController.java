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

import com.cl.entity.GuahaoEntity;
import com.cl.entity.view.GuahaoView;

import com.cl.service.GuahaoService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 挂号
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
@RestController
@RequestMapping("/guahao")
public class GuahaoController {
    @Autowired
    private GuahaoService guahaoService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuahaoEntity guahao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			guahao.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			guahao.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GuahaoEntity> ew = new EntityWrapper<GuahaoEntity>();

		PageUtils page = guahaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guahao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuahaoEntity guahao, 
		HttpServletRequest request){
        EntityWrapper<GuahaoEntity> ew = new EntityWrapper<GuahaoEntity>();

		PageUtils page = guahaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guahao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuahaoEntity guahao){
       	EntityWrapper<GuahaoEntity> ew = new EntityWrapper<GuahaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guahao, "guahao")); 
        return R.ok().put("data", guahaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuahaoEntity guahao){
        EntityWrapper< GuahaoEntity> ew = new EntityWrapper< GuahaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guahao, "guahao")); 
		GuahaoView guahaoView =  guahaoService.selectView(ew);
		return R.ok("查询挂号成功").put("data", guahaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GuahaoEntity guahao = guahaoService.selectById(id);
		guahao = guahaoService.selectView(new EntityWrapper<GuahaoEntity>().eq("id", id));
        return R.ok().put("data", guahao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GuahaoEntity guahao = guahaoService.selectById(id);
		guahao = guahaoService.selectView(new EntityWrapper<GuahaoEntity>().eq("id", id));
        return R.ok().put("data", guahao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuahaoEntity guahao, HttpServletRequest request){
    	guahao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guahao);
        guahaoService.insert(guahao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GuahaoEntity guahao, HttpServletRequest request){
    	guahao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guahao);
        guahaoService.insert(guahao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GuahaoEntity guahao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guahao);
        guahaoService.updateById(guahao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guahaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
