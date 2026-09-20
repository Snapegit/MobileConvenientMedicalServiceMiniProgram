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


import com.cl.dao.YiliaozhishiDao;
import com.cl.entity.YiliaozhishiEntity;
import com.cl.service.YiliaozhishiService;
import com.cl.entity.view.YiliaozhishiView;

@Service("yiliaozhishiService")
public class YiliaozhishiServiceImpl extends ServiceImpl<YiliaozhishiDao, YiliaozhishiEntity> implements YiliaozhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiliaozhishiEntity> page = this.selectPage(
                new Query<YiliaozhishiEntity>(params).getPage(),
                new EntityWrapper<YiliaozhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiliaozhishiEntity> wrapper) {
		  Page<YiliaozhishiView> page =new Query<YiliaozhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YiliaozhishiView> selectListView(Wrapper<YiliaozhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiliaozhishiView selectView(Wrapper<YiliaozhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
