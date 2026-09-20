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


import com.cl.dao.JiankangrijiDao;
import com.cl.entity.JiankangrijiEntity;
import com.cl.service.JiankangrijiService;
import com.cl.entity.view.JiankangrijiView;

@Service("jiankangrijiService")
public class JiankangrijiServiceImpl extends ServiceImpl<JiankangrijiDao, JiankangrijiEntity> implements JiankangrijiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangrijiEntity> page = this.selectPage(
                new Query<JiankangrijiEntity>(params).getPage(),
                new EntityWrapper<JiankangrijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangrijiEntity> wrapper) {
		  Page<JiankangrijiView> page =new Query<JiankangrijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JiankangrijiView> selectListView(Wrapper<JiankangrijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangrijiView selectView(Wrapper<JiankangrijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
