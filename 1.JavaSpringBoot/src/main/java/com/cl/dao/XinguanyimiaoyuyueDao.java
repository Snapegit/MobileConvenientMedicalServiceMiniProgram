package com.cl.dao;

import com.cl.entity.XinguanyimiaoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinguanyimiaoyuyueView;


/**
 * 新冠疫苗预约
 * 
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface XinguanyimiaoyuyueDao extends BaseMapper<XinguanyimiaoyuyueEntity> {
	
	List<XinguanyimiaoyuyueView> selectListView(@Param("ew") Wrapper<XinguanyimiaoyuyueEntity> wrapper);

	List<XinguanyimiaoyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<XinguanyimiaoyuyueEntity> wrapper);
	
	XinguanyimiaoyuyueView selectView(@Param("ew") Wrapper<XinguanyimiaoyuyueEntity> wrapper);
	

}
