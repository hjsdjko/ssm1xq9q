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


import com.dao.YinshileixingDao;
import com.entity.YinshileixingEntity;
import com.service.YinshileixingService;
import com.entity.vo.YinshileixingVO;
import com.entity.view.YinshileixingView;

@Service("yinshileixingService")
public class YinshileixingServiceImpl extends ServiceImpl<YinshileixingDao, YinshileixingEntity> implements YinshileixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinshileixingEntity> page = this.selectPage(
                new Query<YinshileixingEntity>(params).getPage(),
                new EntityWrapper<YinshileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinshileixingEntity> wrapper) {
		  Page<YinshileixingView> page =new Query<YinshileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinshileixingVO> selectListVO(Wrapper<YinshileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinshileixingVO selectVO(Wrapper<YinshileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinshileixingView> selectListView(Wrapper<YinshileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinshileixingView selectView(Wrapper<YinshileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
