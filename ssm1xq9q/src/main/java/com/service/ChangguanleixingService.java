package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChangguanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChangguanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangguanleixingView;


/**
 * 场馆类型
 *
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
public interface ChangguanleixingService extends IService<ChangguanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChangguanleixingVO> selectListVO(Wrapper<ChangguanleixingEntity> wrapper);
   	
   	ChangguanleixingVO selectVO(@Param("ew") Wrapper<ChangguanleixingEntity> wrapper);
   	
   	List<ChangguanleixingView> selectListView(Wrapper<ChangguanleixingEntity> wrapper);
   	
   	ChangguanleixingView selectView(@Param("ew") Wrapper<ChangguanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChangguanleixingEntity> wrapper);
   	

}

