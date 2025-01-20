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


import com.dao.DangyuanfazhanDao;
import com.entity.DangyuanfazhanEntity;
import com.service.DangyuanfazhanService;
import com.entity.vo.DangyuanfazhanVO;
import com.entity.view.DangyuanfazhanView;

@Service("dangyuanfazhanService")
public class DangyuanfazhanServiceImpl extends ServiceImpl<DangyuanfazhanDao, DangyuanfazhanEntity> implements DangyuanfazhanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangyuanfazhanEntity> page = this.selectPage(
                new Query<DangyuanfazhanEntity>(params).getPage(),
                new EntityWrapper<DangyuanfazhanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangyuanfazhanEntity> wrapper) {
		  Page<DangyuanfazhanView> page =new Query<DangyuanfazhanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangyuanfazhanVO> selectListVO(Wrapper<DangyuanfazhanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangyuanfazhanVO selectVO(Wrapper<DangyuanfazhanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangyuanfazhanView> selectListView(Wrapper<DangyuanfazhanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangyuanfazhanView selectView(Wrapper<DangyuanfazhanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
