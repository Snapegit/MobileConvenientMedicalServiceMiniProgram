package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.HpvyimiaoyuyueEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HpvyimiaoyuyueView;


/**
 * hpv疫苗预约
 *
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
public interface HpvyimiaoyuyueService extends IService<HpvyimiaoyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HpvyimiaoyuyueView> selectListView(Wrapper<HpvyimiaoyuyueEntity> wrapper);
   	
   	HpvyimiaoyuyueView selectView(@Param("ew") Wrapper<HpvyimiaoyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HpvyimiaoyuyueEntity> wrapper);
   	

}

