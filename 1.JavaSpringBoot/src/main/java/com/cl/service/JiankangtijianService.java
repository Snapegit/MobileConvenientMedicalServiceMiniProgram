package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JiankangtijianEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiankangtijianView;


/**
 * 健康体检
 *
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
public interface JiankangtijianService extends IService<JiankangtijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangtijianView> selectListView(Wrapper<JiankangtijianEntity> wrapper);
   	
   	JiankangtijianView selectView(@Param("ew") Wrapper<JiankangtijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangtijianEntity> wrapper);
   	

}

