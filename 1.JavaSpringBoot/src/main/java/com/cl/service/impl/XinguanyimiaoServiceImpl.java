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


import com.cl.dao.XinguanyimiaoDao;
import com.cl.entity.XinguanyimiaoEntity;
import com.cl.service.XinguanyimiaoService;
import com.cl.entity.view.XinguanyimiaoView;

@Service("xinguanyimiaoService")
public class XinguanyimiaoServiceImpl extends ServiceImpl<XinguanyimiaoDao, XinguanyimiaoEntity> implements XinguanyimiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinguanyimiaoEntity> page = this.selectPage(
                new Query<XinguanyimiaoEntity>(params).getPage(),
                new EntityWrapper<XinguanyimiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinguanyimiaoEntity> wrapper) {
		  Page<XinguanyimiaoView> page =new Query<XinguanyimiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XinguanyimiaoView> selectListView(Wrapper<XinguanyimiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinguanyimiaoView selectView(Wrapper<XinguanyimiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
