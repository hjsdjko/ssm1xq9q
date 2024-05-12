package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YongchiyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YongchiyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YongchiyudingView;


/**
 * 泳池预定
 *
 * @author 
 * @email 
 * @date 2022-03-16 14:40:34
 */
public interface YongchiyudingService extends IService<YongchiyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YongchiyudingVO> selectListVO(Wrapper<YongchiyudingEntity> wrapper);
   	
   	YongchiyudingVO selectVO(@Param("ew") Wrapper<YongchiyudingEntity> wrapper);
   	
   	List<YongchiyudingView> selectListView(Wrapper<YongchiyudingEntity> wrapper);
   	
   	YongchiyudingView selectView(@Param("ew") Wrapper<YongchiyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YongchiyudingEntity> wrapper);
   	

}

