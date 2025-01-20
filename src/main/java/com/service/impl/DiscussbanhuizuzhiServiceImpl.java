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


import com.dao.DiscussbanhuizuzhiDao;
import com.entity.DiscussbanhuizuzhiEntity;
import com.service.DiscussbanhuizuzhiService;
import com.entity.vo.DiscussbanhuizuzhiVO;
import com.entity.view.DiscussbanhuizuzhiView;

@Service("discussbanhuizuzhiService")
public class DiscussbanhuizuzhiServiceImpl extends ServiceImpl<DiscussbanhuizuzhiDao, DiscussbanhuizuzhiEntity> implements DiscussbanhuizuzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbanhuizuzhiEntity> page = this.selectPage(
                new Query<DiscussbanhuizuzhiEntity>(params).getPage(),
                new EntityWrapper<DiscussbanhuizuzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbanhuizuzhiEntity> wrapper) {
		  Page<DiscussbanhuizuzhiView> page =new Query<DiscussbanhuizuzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbanhuizuzhiVO> selectListVO(Wrapper<DiscussbanhuizuzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbanhuizuzhiVO selectVO(Wrapper<DiscussbanhuizuzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbanhuizuzhiView> selectListView(Wrapper<DiscussbanhuizuzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbanhuizuzhiView selectView(Wrapper<DiscussbanhuizuzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
