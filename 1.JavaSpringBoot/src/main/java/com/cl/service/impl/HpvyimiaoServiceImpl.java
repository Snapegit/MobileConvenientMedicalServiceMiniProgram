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


import com.cl.dao.HpvyimiaoDao;
import com.cl.entity.HpvyimiaoEntity;
import com.cl.service.HpvyimiaoService;
import com.cl.entity.view.HpvyimiaoView;

@Service("hpvyimiaoService")
public class HpvyimiaoServiceImpl extends ServiceImpl<HpvyimiaoDao, HpvyimiaoEntity> implements HpvyimiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HpvyimiaoEntity> page = this.selectPage(
                new Query<HpvyimiaoEntity>(params).getPage(),
                new EntityWrapper<HpvyimiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HpvyimiaoEntity> wrapper) {
		  Page<HpvyimiaoView> page =new Query<HpvyimiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<HpvyimiaoView> selectListView(Wrapper<HpvyimiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HpvyimiaoView selectView(Wrapper<HpvyimiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
