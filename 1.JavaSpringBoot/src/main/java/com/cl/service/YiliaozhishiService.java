package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YiliaozhishiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YiliaozhishiView;


/**
 * 医疗知识
 *
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface YiliaozhishiService extends IService<YiliaozhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiliaozhishiView> selectListView(Wrapper<YiliaozhishiEntity> wrapper);
   	
   	YiliaozhishiView selectView(@Param("ew") Wrapper<YiliaozhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiliaozhishiEntity> wrapper);
   	

}

