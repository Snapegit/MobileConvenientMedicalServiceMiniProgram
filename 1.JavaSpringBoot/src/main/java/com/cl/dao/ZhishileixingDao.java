package com.cl.dao;

import com.cl.entity.ZhishileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhishileixingView;


/**
 * 知识类型
 * 
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface ZhishileixingDao extends BaseMapper<ZhishileixingEntity> {
	
	List<ZhishileixingView> selectListView(@Param("ew") Wrapper<ZhishileixingEntity> wrapper);

	List<ZhishileixingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhishileixingEntity> wrapper);
	
	ZhishileixingView selectView(@Param("ew") Wrapper<ZhishileixingEntity> wrapper);
	

}
