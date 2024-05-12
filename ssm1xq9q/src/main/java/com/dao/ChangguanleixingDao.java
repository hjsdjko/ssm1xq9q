package com.dao;

import com.entity.ChangguanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChangguanleixingVO;
import com.entity.view.ChangguanleixingView;


/**
 * 场馆类型
 * 
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
public interface ChangguanleixingDao extends BaseMapper<ChangguanleixingEntity> {
	
	List<ChangguanleixingVO> selectListVO(@Param("ew") Wrapper<ChangguanleixingEntity> wrapper);
	
	ChangguanleixingVO selectVO(@Param("ew") Wrapper<ChangguanleixingEntity> wrapper);
	
	List<ChangguanleixingView> selectListView(@Param("ew") Wrapper<ChangguanleixingEntity> wrapper);

	List<ChangguanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ChangguanleixingEntity> wrapper);
	
	ChangguanleixingView selectView(@Param("ew") Wrapper<ChangguanleixingEntity> wrapper);
	

}
