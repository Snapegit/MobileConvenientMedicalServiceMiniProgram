package com.cl.dao;

import com.cl.entity.TijianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TijianfenleiView;


/**
 * 体检分类
 * 
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
public interface TijianfenleiDao extends BaseMapper<TijianfenleiEntity> {
	
	List<TijianfenleiView> selectListView(@Param("ew") Wrapper<TijianfenleiEntity> wrapper);

	List<TijianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<TijianfenleiEntity> wrapper);
	
	TijianfenleiView selectView(@Param("ew") Wrapper<TijianfenleiEntity> wrapper);
	

}
