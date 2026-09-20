package com.cl.dao;

import com.cl.entity.HpvyimiaoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HpvyimiaoyuyueView;


/**
 * hpv疫苗预约
 * 
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
public interface HpvyimiaoyuyueDao extends BaseMapper<HpvyimiaoyuyueEntity> {
	
	List<HpvyimiaoyuyueView> selectListView(@Param("ew") Wrapper<HpvyimiaoyuyueEntity> wrapper);

	List<HpvyimiaoyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<HpvyimiaoyuyueEntity> wrapper);
	
	HpvyimiaoyuyueView selectView(@Param("ew") Wrapper<HpvyimiaoyuyueEntity> wrapper);
	

}
