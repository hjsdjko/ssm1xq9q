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


import com.dao.ChangguanxinxiDao;
import com.entity.ChangguanxinxiEntity;
import com.service.ChangguanxinxiService;
import com.entity.vo.ChangguanxinxiVO;
import com.entity.view.ChangguanxinxiView;

@Service("changguanxinxiService")
public class ChangguanxinxiServiceImpl extends ServiceImpl<ChangguanxinxiDao, ChangguanxinxiEntity> implements ChangguanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChangguanxinxiEntity> page = this.selectPage(
                new Query<ChangguanxinxiEntity>(params).getPage(),
                new EntityWrapper<ChangguanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChangguanxinxiEntity> wrapper) {
		  Page<ChangguanxinxiView> page =new Query<ChangguanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChangguanxinxiVO> selectListVO(Wrapper<ChangguanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChangguanxinxiVO selectVO(Wrapper<ChangguanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChangguanxinxiView> selectListView(Wrapper<ChangguanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChangguanxinxiView selectView(Wrapper<ChangguanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
