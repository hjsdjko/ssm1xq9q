package com.dao;

import com.entity.YongchileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YongchileixingVO;
import com.entity.view.YongchileixingView;


/**
 * 泳池类型
 * 
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
public interface YongchileixingDao extends BaseMapper<YongchileixingEntity> {
	
	List<YongchileixingVO> selectListVO(@Param("ew") Wrapper<YongchileixingEntity> wrapper);
	
	YongchileixingVO selectVO(@Param("ew") Wrapper<YongchileixingEntity> wrapper);
	
	List<YongchileixingView> selectListView(@Param("ew") Wrapper<YongchileixingEntity> wrapper);

	List<YongchileixingView> selectListView(Pagination page,@Param("ew") Wrapper<YongchileixingEntity> wrapper);
	
	YongchileixingView selectView(@Param("ew") Wrapper<YongchileixingEntity> wrapper);
	

}
