package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XinguanyimiaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinguanyimiaoView;


/**
 * 新冠疫苗
 *
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface XinguanyimiaoService extends IService<XinguanyimiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinguanyimiaoView> selectListView(Wrapper<XinguanyimiaoEntity> wrapper);
   	
   	XinguanyimiaoView selectView(@Param("ew") Wrapper<XinguanyimiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinguanyimiaoEntity> wrapper);
   	

}

