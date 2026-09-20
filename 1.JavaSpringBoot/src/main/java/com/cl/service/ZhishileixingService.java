package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZhishileixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhishileixingView;


/**
 * 知识类型
 *
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface ZhishileixingService extends IService<ZhishileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhishileixingView> selectListView(Wrapper<ZhishileixingEntity> wrapper);
   	
   	ZhishileixingView selectView(@Param("ew") Wrapper<ZhishileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhishileixingEntity> wrapper);
   	

}

