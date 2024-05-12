package com.dao;

import com.entity.YongchixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YongchixinxiVO;
import com.entity.view.YongchixinxiView;


/**
 * 泳池信息
 * 
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
public interface YongchixinxiDao extends BaseMapper<YongchixinxiEntity> {
	
	List<YongchixinxiVO> selectListVO(@Param("ew") Wrapper<YongchixinxiEntity> wrapper);
	
	YongchixinxiVO selectVO(@Param("ew") Wrapper<YongchixinxiEntity> wrapper);
	
	List<YongchixinxiView> selectListView(@Param("ew") Wrapper<YongchixinxiEntity> wrapper);

	List<YongchixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YongchixinxiEntity> wrapper);
	
	YongchixinxiView selectView(@Param("ew") Wrapper<YongchixinxiEntity> wrapper);
	

}
