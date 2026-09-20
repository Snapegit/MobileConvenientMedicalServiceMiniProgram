package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XinguanyimiaoyuyueEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinguanyimiaoyuyueView;


/**
 * 新冠疫苗预约
 *
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface XinguanyimiaoyuyueService extends IService<XinguanyimiaoyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinguanyimiaoyuyueView> selectListView(Wrapper<XinguanyimiaoyuyueEntity> wrapper);
   	
   	XinguanyimiaoyuyueView selectView(@Param("ew") Wrapper<XinguanyimiaoyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinguanyimiaoyuyueEntity> wrapper);
   	

}

