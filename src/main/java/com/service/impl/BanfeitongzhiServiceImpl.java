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


import com.dao.BanfeitongzhiDao;
import com.entity.BanfeitongzhiEntity;
import com.service.BanfeitongzhiService;
import com.entity.vo.BanfeitongzhiVO;
import com.entity.view.BanfeitongzhiView;

@Service("banfeitongzhiService")
public class BanfeitongzhiServiceImpl extends ServiceImpl<BanfeitongzhiDao, BanfeitongzhiEntity> implements BanfeitongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanfeitongzhiEntity> page = this.selectPage(
                new Query<BanfeitongzhiEntity>(params).getPage(),
                new EntityWrapper<BanfeitongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanfeitongzhiEntity> wrapper) {
		  Page<BanfeitongzhiView> page =new Query<BanfeitongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanfeitongzhiVO> selectListVO(Wrapper<BanfeitongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanfeitongzhiVO selectVO(Wrapper<BanfeitongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanfeitongzhiView> selectListView(Wrapper<BanfeitongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanfeitongzhiView selectView(Wrapper<BanfeitongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
