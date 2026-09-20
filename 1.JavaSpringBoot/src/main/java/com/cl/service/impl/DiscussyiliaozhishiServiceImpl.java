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


import com.cl.dao.DiscussyiliaozhishiDao;
import com.cl.entity.DiscussyiliaozhishiEntity;
import com.cl.service.DiscussyiliaozhishiService;
import com.cl.entity.view.DiscussyiliaozhishiView;

@Service("discussyiliaozhishiService")
public class DiscussyiliaozhishiServiceImpl extends ServiceImpl<DiscussyiliaozhishiDao, DiscussyiliaozhishiEntity> implements DiscussyiliaozhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyiliaozhishiEntity> page = this.selectPage(
                new Query<DiscussyiliaozhishiEntity>(params).getPage(),
                new EntityWrapper<DiscussyiliaozhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyiliaozhishiEntity> wrapper) {
		  Page<DiscussyiliaozhishiView> page =new Query<DiscussyiliaozhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussyiliaozhishiView> selectListView(Wrapper<DiscussyiliaozhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyiliaozhishiView selectView(Wrapper<DiscussyiliaozhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
