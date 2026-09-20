package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.BaogaoxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BaogaoxinxiView;


/**
 * 报告信息
 *
 * @author 
 * @email 
 * @date 2024-02-25 21:48:06
 */
public interface BaogaoxinxiService extends IService<BaogaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaogaoxinxiView> selectListView(Wrapper<BaogaoxinxiEntity> wrapper);
   	
   	BaogaoxinxiView selectView(@Param("ew") Wrapper<BaogaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaogaoxinxiEntity> wrapper);
   	

}

