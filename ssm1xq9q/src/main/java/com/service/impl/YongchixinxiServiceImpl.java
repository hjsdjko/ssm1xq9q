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


import com.dao.YongchixinxiDao;
import com.entity.YongchixinxiEntity;
import com.service.YongchixinxiService;
import com.entity.vo.YongchixinxiVO;
import com.entity.view.YongchixinxiView;

@Service("yongchixinxiService")
public class YongchixinxiServiceImpl extends ServiceImpl<YongchixinxiDao, YongchixinxiEntity> implements YongchixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YongchixinxiEntity> page = this.selectPage(
                new Query<YongchixinxiEntity>(params).getPage(),
                new EntityWrapper<YongchixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YongchixinxiEntity> wrapper) {
		  Page<YongchixinxiView> page =new Query<YongchixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YongchixinxiVO> selectListVO(Wrapper<YongchixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YongchixinxiVO selectVO(Wrapper<YongchixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YongchixinxiView> selectListView(Wrapper<YongchixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YongchixinxiView selectView(Wrapper<YongchixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
