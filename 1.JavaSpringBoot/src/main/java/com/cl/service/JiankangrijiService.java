package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JiankangrijiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiankangrijiView;


/**
 * 健康日记
 *
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface JiankangrijiService extends IService<JiankangrijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangrijiView> selectListView(Wrapper<JiankangrijiEntity> wrapper);
   	
   	JiankangrijiView selectView(@Param("ew") Wrapper<JiankangrijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangrijiEntity> wrapper);
   	

}

