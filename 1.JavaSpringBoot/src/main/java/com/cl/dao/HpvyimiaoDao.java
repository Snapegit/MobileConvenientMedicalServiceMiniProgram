package com.cl.dao;

import com.cl.entity.HpvyimiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HpvyimiaoView;


/**
 * hpv疫苗
 * 
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
public interface HpvyimiaoDao extends BaseMapper<HpvyimiaoEntity> {
	
	List<HpvyimiaoView> selectListView(@Param("ew") Wrapper<HpvyimiaoEntity> wrapper);

	List<HpvyimiaoView> selectListView(Pagination page,@Param("ew") Wrapper<HpvyimiaoEntity> wrapper);
	
	HpvyimiaoView selectView(@Param("ew") Wrapper<HpvyimiaoEntity> wrapper);
	

}
