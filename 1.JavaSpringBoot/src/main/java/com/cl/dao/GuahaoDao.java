package com.cl.dao;

import com.cl.entity.GuahaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GuahaoView;


/**
 * 挂号
 * 
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface GuahaoDao extends BaseMapper<GuahaoEntity> {
	
	List<GuahaoView> selectListView(@Param("ew") Wrapper<GuahaoEntity> wrapper);

	List<GuahaoView> selectListView(Pagination page,@Param("ew") Wrapper<GuahaoEntity> wrapper);
	
	GuahaoView selectView(@Param("ew") Wrapper<GuahaoEntity> wrapper);
	

}
