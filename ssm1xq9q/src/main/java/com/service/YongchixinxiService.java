package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YongchixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YongchixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YongchixinxiView;


/**
 * 泳池信息
 *
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
public interface YongchixinxiService extends IService<YongchixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YongchixinxiVO> selectListVO(Wrapper<YongchixinxiEntity> wrapper);
   	
   	YongchixinxiVO selectVO(@Param("ew") Wrapper<YongchixinxiEntity> wrapper);
   	
   	List<YongchixinxiView> selectListView(Wrapper<YongchixinxiEntity> wrapper);
   	
   	YongchixinxiView selectView(@Param("ew") Wrapper<YongchixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YongchixinxiEntity> wrapper);
   	

}

