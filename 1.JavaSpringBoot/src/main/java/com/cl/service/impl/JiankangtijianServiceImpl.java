package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.JiankangtijianDao;
import com.cl.entity.JiankangtijianEntity;
import com.cl.service.JiankangtijianService;
import com.cl.entity.view.JiankangtijianView;

@Service("jiankangtijianService")
public class JiankangtijianServiceImpl extends ServiceImpl<JiankangtijianDao, JiankangtijianEntity> implements JiankangtijianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangtijianEntity> page = this.selectPage(
                new Query<JiankangtijianEntity>(params).getPage(),
                new EntityWrapper<JiankangtijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangtijianEntity> wrapper) {
		  Page<JiankangtijianView> page =new Query<JiankangtijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JiankangtijianView> selectListView(Wrapper<JiankangtijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangtijianView selectView(Wrapper<JiankangtijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
