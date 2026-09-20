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


import com.cl.dao.BaogaoxinxiDao;
import com.cl.entity.BaogaoxinxiEntity;
import com.cl.service.BaogaoxinxiService;
import com.cl.entity.view.BaogaoxinxiView;

@Service("baogaoxinxiService")
public class BaogaoxinxiServiceImpl extends ServiceImpl<BaogaoxinxiDao, BaogaoxinxiEntity> implements BaogaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaogaoxinxiEntity> page = this.selectPage(
                new Query<BaogaoxinxiEntity>(params).getPage(),
                new EntityWrapper<BaogaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaogaoxinxiEntity> wrapper) {
		  Page<BaogaoxinxiView> page =new Query<BaogaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<BaogaoxinxiView> selectListView(Wrapper<BaogaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaogaoxinxiView selectView(Wrapper<BaogaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
