package com.cl.dao;

import com.cl.entity.XinguanyimiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinguanyimiaoView;


/**
 * 新冠疫苗
 * 
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface XinguanyimiaoDao extends BaseMapper<XinguanyimiaoEntity> {
	
	List<XinguanyimiaoView> selectListView(@Param("ew") Wrapper<XinguanyimiaoEntity> wrapper);

	List<XinguanyimiaoView> selectListView(Pagination page,@Param("ew") Wrapper<XinguanyimiaoEntity> wrapper);
	
	XinguanyimiaoView selectView(@Param("ew") Wrapper<XinguanyimiaoEntity> wrapper);
	

}
