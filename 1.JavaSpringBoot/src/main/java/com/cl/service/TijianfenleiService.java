package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.TijianfenleiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TijianfenleiView;


/**
 * 体检分类
 *
 * @author 
 * @email 
 * @date 2024-02-25 21:48:05
 */
public interface TijianfenleiService extends IService<TijianfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijianfenleiView> selectListView(Wrapper<TijianfenleiEntity> wrapper);
   	
   	TijianfenleiView selectView(@Param("ew") Wrapper<TijianfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijianfenleiEntity> wrapper);
   	

}

