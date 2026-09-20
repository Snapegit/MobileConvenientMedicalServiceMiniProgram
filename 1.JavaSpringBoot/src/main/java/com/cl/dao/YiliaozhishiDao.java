package com.cl.dao;

import com.cl.entity.YiliaozhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YiliaozhishiView;


/**
 * 医疗知识
 * 
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface YiliaozhishiDao extends BaseMapper<YiliaozhishiEntity> {
	
	List<YiliaozhishiView> selectListView(@Param("ew") Wrapper<YiliaozhishiEntity> wrapper);

	List<YiliaozhishiView> selectListView(Pagination page,@Param("ew") Wrapper<YiliaozhishiEntity> wrapper);
	
	YiliaozhishiView selectView(@Param("ew") Wrapper<YiliaozhishiEntity> wrapper);
	

}
