package com.cl.dao;

import com.cl.entity.DiscussyiliaozhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussyiliaozhishiView;


/**
 * 医疗知识评论表
 * 
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface DiscussyiliaozhishiDao extends BaseMapper<DiscussyiliaozhishiEntity> {
	
	List<DiscussyiliaozhishiView> selectListView(@Param("ew") Wrapper<DiscussyiliaozhishiEntity> wrapper);

	List<DiscussyiliaozhishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyiliaozhishiEntity> wrapper);
	
	DiscussyiliaozhishiView selectView(@Param("ew") Wrapper<DiscussyiliaozhishiEntity> wrapper);
	

}
