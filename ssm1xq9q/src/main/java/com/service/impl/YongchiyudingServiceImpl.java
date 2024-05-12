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


import com.dao.YongchiyudingDao;
import com.entity.YongchiyudingEntity;
import com.service.YongchiyudingService;
import com.entity.vo.YongchiyudingVO;
import com.entity.view.YongchiyudingView;

@Service("yongchiyudingService")
public class YongchiyudingServiceImpl extends ServiceImpl<YongchiyudingDao, YongchiyudingEntity> implements YongchiyudingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YongchiyudingEntity> page = this.selectPage(
                new Query<YongchiyudingEntity>(params).getPage(),
                new EntityWrapper<YongchiyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YongchiyudingEntity> wrapper) {
		  Page<YongchiyudingView> page =new Query<YongchiyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YongchiyudingVO> selectListVO(Wrapper<YongchiyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YongchiyudingVO selectVO(Wrapper<YongchiyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YongchiyudingView> selectListView(Wrapper<YongchiyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YongchiyudingView selectView(Wrapper<YongchiyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
