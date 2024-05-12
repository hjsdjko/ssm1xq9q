package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YongchileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YongchileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YongchileixingView;


/**
 * 泳池类型
 *
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
public interface YongchileixingService extends IService<YongchileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YongchileixingVO> selectListVO(Wrapper<YongchileixingEntity> wrapper);
   	
   	YongchileixingVO selectVO(@Param("ew") Wrapper<YongchileixingEntity> wrapper);
   	
   	List<YongchileixingView> selectListView(Wrapper<YongchileixingEntity> wrapper);
   	
   	YongchileixingView selectView(@Param("ew") Wrapper<YongchileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YongchileixingEntity> wrapper);
   	

}

