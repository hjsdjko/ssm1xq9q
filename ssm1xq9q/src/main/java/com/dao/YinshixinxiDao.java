package com.dao;

import com.entity.YinshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinshixinxiVO;
import com.entity.view.YinshixinxiView;


/**
 * 饮食信息
 * 
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
public interface YinshixinxiDao extends BaseMapper<YinshixinxiEntity> {
	
	List<YinshixinxiVO> selectListVO(@Param("ew") Wrapper<YinshixinxiEntity> wrapper);
	
	YinshixinxiVO selectVO(@Param("ew") Wrapper<YinshixinxiEntity> wrapper);
	
	List<YinshixinxiView> selectListView(@Param("ew") Wrapper<YinshixinxiEntity> wrapper);

	List<YinshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YinshixinxiEntity> wrapper);
	
	YinshixinxiView selectView(@Param("ew") Wrapper<YinshixinxiEntity> wrapper);
	

}
