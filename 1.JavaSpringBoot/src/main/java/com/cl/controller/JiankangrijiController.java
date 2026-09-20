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

import com.cl.entity.JiankangrijiEntity;
import com.cl.entity.view.JiankangrijiView;

import com.cl.service.JiankangrijiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 健康日记
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
@RestController
@RequestMapping("/jiankangriji")
public class JiankangrijiController {
    @Autowired
    private JiankangrijiService jiankangrijiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiankangrijiEntity jiankangriji,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiankangriji.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiankangrijiEntity> ew = new EntityWrapper<JiankangrijiEntity>();

		PageUtils page = jiankangrijiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangriji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiankangrijiEntity jiankangriji, 
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiankangriji.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiankangrijiEntity> ew = new EntityWrapper<JiankangrijiEntity>();

		PageUtils page = jiankangrijiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangriji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiankangrijiEntity jiankangriji){
       	EntityWrapper<JiankangrijiEntity> ew = new EntityWrapper<JiankangrijiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiankangriji, "jiankangriji")); 
        return R.ok().put("data", jiankangrijiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiankangrijiEntity jiankangriji){
        EntityWrapper< JiankangrijiEntity> ew = new EntityWrapper< JiankangrijiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiankangriji, "jiankangriji")); 
		JiankangrijiView jiankangrijiView =  jiankangrijiService.selectView(ew);
		return R.ok("查询健康日记成功").put("data", jiankangrijiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiankangrijiEntity jiankangriji = jiankangrijiService.selectById(id);
		jiankangriji = jiankangrijiService.selectView(new EntityWrapper<JiankangrijiEntity>().eq("id", id));
        return R.ok().put("data", jiankangriji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiankangrijiEntity jiankangriji = jiankangrijiService.selectById(id);
		jiankangriji = jiankangrijiService.selectView(new EntityWrapper<JiankangrijiEntity>().eq("id", id));
        return R.ok().put("data", jiankangriji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiankangrijiEntity jiankangriji, HttpServletRequest request){
    	jiankangriji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiankangriji);
        jiankangrijiService.insert(jiankangriji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiankangrijiEntity jiankangriji, HttpServletRequest request){
    	jiankangriji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiankangriji);
    	jiankangriji.setUserid((Long)request.getSession().getAttribute("userId"));
        jiankangrijiService.insert(jiankangriji);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiankangrijiEntity jiankangriji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiankangriji);
        jiankangrijiService.updateById(jiankangriji);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiankangrijiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
