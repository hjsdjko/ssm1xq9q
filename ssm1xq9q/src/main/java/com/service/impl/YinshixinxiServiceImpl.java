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


import com.dao.YinshixinxiDao;
import com.entity.YinshixinxiEntity;
import com.service.YinshixinxiService;
import com.entity.vo.YinshixinxiVO;
import com.entity.view.YinshixinxiView;

@Service("yinshixinxiService")
public class YinshixinxiServiceImpl extends ServiceImpl<YinshixinxiDao, YinshixinxiEntity> implements YinshixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinshixinxiEntity> page = this.selectPage(
                new Query<YinshixinxiEntity>(params).getPage(),
                new EntityWrapper<YinshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinshixinxiEntity> wrapper) {
		  Page<YinshixinxiView> page =new Query<YinshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinshixinxiVO> selectListVO(Wrapper<YinshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinshixinxiVO selectVO(Wrapper<YinshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinshixinxiView> selectListView(Wrapper<YinshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinshixinxiView selectView(Wrapper<YinshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
