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


import com.dao.BanhuizuzhiDao;
import com.entity.BanhuizuzhiEntity;
import com.service.BanhuizuzhiService;
import com.entity.vo.BanhuizuzhiVO;
import com.entity.view.BanhuizuzhiView;

@Service("banhuizuzhiService")
public class BanhuizuzhiServiceImpl extends ServiceImpl<BanhuizuzhiDao, BanhuizuzhiEntity> implements BanhuizuzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanhuizuzhiEntity> page = this.selectPage(
                new Query<BanhuizuzhiEntity>(params).getPage(),
                new EntityWrapper<BanhuizuzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanhuizuzhiEntity> wrapper) {
		  Page<BanhuizuzhiView> page =new Query<BanhuizuzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanhuizuzhiVO> selectListVO(Wrapper<BanhuizuzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanhuizuzhiVO selectVO(Wrapper<BanhuizuzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanhuizuzhiView> selectListView(Wrapper<BanhuizuzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanhuizuzhiView selectView(Wrapper<BanhuizuzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
