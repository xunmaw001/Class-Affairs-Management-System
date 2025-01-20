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


import com.dao.DangyuanpeixunDao;
import com.entity.DangyuanpeixunEntity;
import com.service.DangyuanpeixunService;
import com.entity.vo.DangyuanpeixunVO;
import com.entity.view.DangyuanpeixunView;

@Service("dangyuanpeixunService")
public class DangyuanpeixunServiceImpl extends ServiceImpl<DangyuanpeixunDao, DangyuanpeixunEntity> implements DangyuanpeixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangyuanpeixunEntity> page = this.selectPage(
                new Query<DangyuanpeixunEntity>(params).getPage(),
                new EntityWrapper<DangyuanpeixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangyuanpeixunEntity> wrapper) {
		  Page<DangyuanpeixunView> page =new Query<DangyuanpeixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangyuanpeixunVO> selectListVO(Wrapper<DangyuanpeixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangyuanpeixunVO selectVO(Wrapper<DangyuanpeixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangyuanpeixunView> selectListView(Wrapper<DangyuanpeixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangyuanpeixunView selectView(Wrapper<DangyuanpeixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
