package com.cl.dao;

import com.cl.entity.BaogaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BaogaoxinxiView;


/**
 * 报告信息
 * 
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface BaogaoxinxiDao extends BaseMapper<BaogaoxinxiEntity> {
	
	List<BaogaoxinxiView> selectListView(@Param("ew") Wrapper<BaogaoxinxiEntity> wrapper);

	List<BaogaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaogaoxinxiEntity> wrapper);
	
	BaogaoxinxiView selectView(@Param("ew") Wrapper<BaogaoxinxiEntity> wrapper);
	

}
