package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.HpvyimiaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HpvyimiaoView;


/**
 * hpv疫苗
 *
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
public interface HpvyimiaoService extends IService<HpvyimiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HpvyimiaoView> selectListView(Wrapper<HpvyimiaoEntity> wrapper);
   	
   	HpvyimiaoView selectView(@Param("ew") Wrapper<HpvyimiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HpvyimiaoEntity> wrapper);
   	

}

