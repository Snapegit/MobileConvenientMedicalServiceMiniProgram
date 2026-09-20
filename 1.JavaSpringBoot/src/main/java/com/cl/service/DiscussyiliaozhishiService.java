package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussyiliaozhishiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussyiliaozhishiView;


/**
 * 医疗知识评论表
 *
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface DiscussyiliaozhishiService extends IService<DiscussyiliaozhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyiliaozhishiView> selectListView(Wrapper<DiscussyiliaozhishiEntity> wrapper);
   	
   	DiscussyiliaozhishiView selectView(@Param("ew") Wrapper<DiscussyiliaozhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyiliaozhishiEntity> wrapper);
   	

}

