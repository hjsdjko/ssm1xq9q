package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinshixinxiView;


/**
 * 饮食信息
 *
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
public interface YinshixinxiService extends IService<YinshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinshixinxiVO> selectListVO(Wrapper<YinshixinxiEntity> wrapper);
   	
   	YinshixinxiVO selectVO(@Param("ew") Wrapper<YinshixinxiEntity> wrapper);
   	
   	List<YinshixinxiView> selectListView(Wrapper<YinshixinxiEntity> wrapper);
   	
   	YinshixinxiView selectView(@Param("ew") Wrapper<YinshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinshixinxiEntity> wrapper);
   	

}

