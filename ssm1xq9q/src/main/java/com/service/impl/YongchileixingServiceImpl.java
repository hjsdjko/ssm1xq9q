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


import com.dao.YongchileixingDao;
import com.entity.YongchileixingEntity;
import com.service.YongchileixingService;
import com.entity.vo.YongchileixingVO;
import com.entity.view.YongchileixingView;

@Service("yongchileixingService")
public class YongchileixingServiceImpl extends ServiceImpl<YongchileixingDao, YongchileixingEntity> implements YongchileixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YongchileixingEntity> page = this.selectPage(
                new Query<YongchileixingEntity>(params).getPage(),
                new EntityWrapper<YongchileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YongchileixingEntity> wrapper) {
		  Page<YongchileixingView> page =new Query<YongchileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YongchileixingVO> selectListVO(Wrapper<YongchileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YongchileixingVO selectVO(Wrapper<YongchileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YongchileixingView> selectListView(Wrapper<YongchileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YongchileixingView selectView(Wrapper<YongchileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
