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


import com.dao.DiscusswenhuaxuexiDao;
import com.entity.DiscusswenhuaxuexiEntity;
import com.service.DiscusswenhuaxuexiService;
import com.entity.vo.DiscusswenhuaxuexiVO;
import com.entity.view.DiscusswenhuaxuexiView;

@Service("discusswenhuaxuexiService")
public class DiscusswenhuaxuexiServiceImpl extends ServiceImpl<DiscusswenhuaxuexiDao, DiscusswenhuaxuexiEntity> implements DiscusswenhuaxuexiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswenhuaxuexiEntity> page = this.selectPage(
                new Query<DiscusswenhuaxuexiEntity>(params).getPage(),
                new EntityWrapper<DiscusswenhuaxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswenhuaxuexiEntity> wrapper) {
		  Page<DiscusswenhuaxuexiView> page =new Query<DiscusswenhuaxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswenhuaxuexiVO> selectListVO(Wrapper<DiscusswenhuaxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswenhuaxuexiVO selectVO(Wrapper<DiscusswenhuaxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswenhuaxuexiView> selectListView(Wrapper<DiscusswenhuaxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswenhuaxuexiView selectView(Wrapper<DiscusswenhuaxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
