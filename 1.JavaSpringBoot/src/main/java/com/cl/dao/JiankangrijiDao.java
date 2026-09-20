package com.cl.dao;

import com.cl.entity.JiankangrijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiankangrijiView;


/**
 * 健康日记
 * 
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface JiankangrijiDao extends BaseMapper<JiankangrijiEntity> {
	
	List<JiankangrijiView> selectListView(@Param("ew") Wrapper<JiankangrijiEntity> wrapper);

	List<JiankangrijiView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangrijiEntity> wrapper);
	
	JiankangrijiView selectView(@Param("ew") Wrapper<JiankangrijiEntity> wrapper);
	

}
