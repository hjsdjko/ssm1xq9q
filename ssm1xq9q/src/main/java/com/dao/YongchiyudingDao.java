package com.dao;

import com.entity.YongchiyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YongchiyudingVO;
import com.entity.view.YongchiyudingView;


/**
 * 泳池预定
 * 
 * @author 
 * @email 
 * @date 2022-03-16 14:40:34
 */
public interface YongchiyudingDao extends BaseMapper<YongchiyudingEntity> {
	
	List<YongchiyudingVO> selectListVO(@Param("ew") Wrapper<YongchiyudingEntity> wrapper);
	
	YongchiyudingVO selectVO(@Param("ew") Wrapper<YongchiyudingEntity> wrapper);
	
	List<YongchiyudingView> selectListView(@Param("ew") Wrapper<YongchiyudingEntity> wrapper);

	List<YongchiyudingView> selectListView(Pagination page,@Param("ew") Wrapper<YongchiyudingEntity> wrapper);
	
	YongchiyudingView selectView(@Param("ew") Wrapper<YongchiyudingEntity> wrapper);
	

}
