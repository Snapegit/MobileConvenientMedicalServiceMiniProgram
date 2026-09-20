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


import com.cl.dao.HpvyimiaoyuyueDao;
import com.cl.entity.HpvyimiaoyuyueEntity;
import com.cl.service.HpvyimiaoyuyueService;
import com.cl.entity.view.HpvyimiaoyuyueView;

@Service("hpvyimiaoyuyueService")
public class HpvyimiaoyuyueServiceImpl extends ServiceImpl<HpvyimiaoyuyueDao, HpvyimiaoyuyueEntity> implements HpvyimiaoyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HpvyimiaoyuyueEntity> page = this.selectPage(
                new Query<HpvyimiaoyuyueEntity>(params).getPage(),
                new EntityWrapper<HpvyimiaoyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HpvyimiaoyuyueEntity> wrapper) {
		  Page<HpvyimiaoyuyueView> page =new Query<HpvyimiaoyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<HpvyimiaoyuyueView> selectListView(Wrapper<HpvyimiaoyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HpvyimiaoyuyueView selectView(Wrapper<HpvyimiaoyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
