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


import com.cl.dao.GuahaoDao;
import com.cl.entity.GuahaoEntity;
import com.cl.service.GuahaoService;
import com.cl.entity.view.GuahaoView;

@Service("guahaoService")
public class GuahaoServiceImpl extends ServiceImpl<GuahaoDao, GuahaoEntity> implements GuahaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuahaoEntity> page = this.selectPage(
                new Query<GuahaoEntity>(params).getPage(),
                new EntityWrapper<GuahaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuahaoEntity> wrapper) {
		  Page<GuahaoView> page =new Query<GuahaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<GuahaoView> selectListView(Wrapper<GuahaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuahaoView selectView(Wrapper<GuahaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
