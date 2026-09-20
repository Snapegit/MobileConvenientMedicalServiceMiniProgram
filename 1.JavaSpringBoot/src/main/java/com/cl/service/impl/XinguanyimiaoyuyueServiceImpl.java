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


import com.cl.dao.XinguanyimiaoyuyueDao;
import com.cl.entity.XinguanyimiaoyuyueEntity;
import com.cl.service.XinguanyimiaoyuyueService;
import com.cl.entity.view.XinguanyimiaoyuyueView;

@Service("xinguanyimiaoyuyueService")
public class XinguanyimiaoyuyueServiceImpl extends ServiceImpl<XinguanyimiaoyuyueDao, XinguanyimiaoyuyueEntity> implements XinguanyimiaoyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinguanyimiaoyuyueEntity> page = this.selectPage(
                new Query<XinguanyimiaoyuyueEntity>(params).getPage(),
                new EntityWrapper<XinguanyimiaoyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinguanyimiaoyuyueEntity> wrapper) {
		  Page<XinguanyimiaoyuyueView> page =new Query<XinguanyimiaoyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XinguanyimiaoyuyueView> selectListView(Wrapper<XinguanyimiaoyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinguanyimiaoyuyueView selectView(Wrapper<XinguanyimiaoyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
