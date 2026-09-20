package com.cl.dao;

import com.cl.entity.JiankangtijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiankangtijianView;


/**
 * 健康体检
 * 
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
public interface JiankangtijianDao extends BaseMapper<JiankangtijianEntity> {
	
	List<JiankangtijianView> selectListView(@Param("ew") Wrapper<JiankangtijianEntity> wrapper);

	List<JiankangtijianView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangtijianEntity> wrapper);
	
	JiankangtijianView selectView(@Param("ew") Wrapper<JiankangtijianEntity> wrapper);
	

}
