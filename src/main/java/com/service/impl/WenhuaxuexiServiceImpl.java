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


import com.dao.WenhuaxuexiDao;
import com.entity.WenhuaxuexiEntity;
import com.service.WenhuaxuexiService;
import com.entity.vo.WenhuaxuexiVO;
import com.entity.view.WenhuaxuexiView;

@Service("wenhuaxuexiService")
public class WenhuaxuexiServiceImpl extends ServiceImpl<WenhuaxuexiDao, WenhuaxuexiEntity> implements WenhuaxuexiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenhuaxuexiEntity> page = this.selectPage(
                new Query<WenhuaxuexiEntity>(params).getPage(),
                new EntityWrapper<WenhuaxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenhuaxuexiEntity> wrapper) {
		  Page<WenhuaxuexiView> page =new Query<WenhuaxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenhuaxuexiVO> selectListVO(Wrapper<WenhuaxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenhuaxuexiVO selectVO(Wrapper<WenhuaxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenhuaxuexiView> selectListView(Wrapper<WenhuaxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenhuaxuexiView selectView(Wrapper<WenhuaxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
