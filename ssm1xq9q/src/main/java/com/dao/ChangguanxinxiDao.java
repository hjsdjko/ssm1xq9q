package com.dao;

import com.entity.ChangguanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChangguanxinxiVO;
import com.entity.view.ChangguanxinxiView;


/**
 * 场馆信息
 * 
 * @author 
 * @email 
 * @date 2022-03-16 14:40:33
 */
public interface ChangguanxinxiDao extends BaseMapper<ChangguanxinxiEntity> {
	
	List<ChangguanxinxiVO> selectListVO(@Param("ew") Wrapper<ChangguanxinxiEntity> wrapper);
	
	ChangguanxinxiVO selectVO(@Param("ew") Wrapper<ChangguanxinxiEntity> wrapper);
	
	List<ChangguanxinxiView> selectListView(@Param("ew") Wrapper<ChangguanxinxiEntity> wrapper);

	List<ChangguanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChangguanxinxiEntity> wrapper);
	
	ChangguanxinxiView selectView(@Param("ew") Wrapper<ChangguanxinxiEntity> wrapper);
	

}
