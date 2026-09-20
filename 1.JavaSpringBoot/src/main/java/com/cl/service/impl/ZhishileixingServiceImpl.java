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


import com.cl.dao.ZhishileixingDao;
import com.cl.entity.ZhishileixingEntity;
import com.cl.service.ZhishileixingService;
import com.cl.entity.view.ZhishileixingView;

@Service("zhishileixingService")
public class ZhishileixingServiceImpl extends ServiceImpl<ZhishileixingDao, ZhishileixingEntity> implements ZhishileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhishileixingEntity> page = this.selectPage(
                new Query<ZhishileixingEntity>(params).getPage(),
                new EntityWrapper<ZhishileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhishileixingEntity> wrapper) {
		  Page<ZhishileixingView> page =new Query<ZhishileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZhishileixingView> selectListView(Wrapper<ZhishileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhishileixingView selectView(Wrapper<ZhishileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
