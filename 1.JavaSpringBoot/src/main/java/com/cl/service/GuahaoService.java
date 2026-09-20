package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.GuahaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GuahaoView;


/**
 * 挂号
 *
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface GuahaoService extends IService<GuahaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuahaoView> selectListView(Wrapper<GuahaoEntity> wrapper);
   	
   	GuahaoView selectView(@Param("ew") Wrapper<GuahaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuahaoEntity> wrapper);
   	

}

