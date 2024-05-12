package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChangguanleixingDao;
import com.entity.ChangguanleixingEntity;
import com.service.ChangguanleixingService;
import com.entity.vo.ChangguanleixingVO;
import com.entity.view.ChangguanleixingView;

@Service("changguanleixingService")
public class ChangguanleixingServiceImpl extends ServiceImpl<ChangguanleixingDao, ChangguanleixingEntity> implements ChangguanleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChangguanleixingEntity> page = this.selectPage(
                new Query<ChangguanleixingEntity>(params).getPage(),
                new EntityWrapper<ChangguanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChangguanleixingEntity> wrapper) {
		  Page<ChangguanleixingView> page =new Query<ChangguanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChangguanleixingVO> selectListVO(Wrapper<ChangguanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChangguanleixingVO selectVO(Wrapper<ChangguanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChangguanleixingView> selectListView(Wrapper<ChangguanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChangguanleixingView selectView(Wrapper<ChangguanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
