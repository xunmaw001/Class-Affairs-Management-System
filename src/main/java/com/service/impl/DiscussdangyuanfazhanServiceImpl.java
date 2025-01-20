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


import com.dao.DiscussdangyuanfazhanDao;
import com.entity.DiscussdangyuanfazhanEntity;
import com.service.DiscussdangyuanfazhanService;
import com.entity.vo.DiscussdangyuanfazhanVO;
import com.entity.view.DiscussdangyuanfazhanView;

@Service("discussdangyuanfazhanService")
public class DiscussdangyuanfazhanServiceImpl extends ServiceImpl<DiscussdangyuanfazhanDao, DiscussdangyuanfazhanEntity> implements DiscussdangyuanfazhanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdangyuanfazhanEntity> page = this.selectPage(
                new Query<DiscussdangyuanfazhanEntity>(params).getPage(),
                new EntityWrapper<DiscussdangyuanfazhanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdangyuanfazhanEntity> wrapper) {
		  Page<DiscussdangyuanfazhanView> page =new Query<DiscussdangyuanfazhanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdangyuanfazhanVO> selectListVO(Wrapper<DiscussdangyuanfazhanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdangyuanfazhanVO selectVO(Wrapper<DiscussdangyuanfazhanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdangyuanfazhanView> selectListView(Wrapper<DiscussdangyuanfazhanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdangyuanfazhanView selectView(Wrapper<DiscussdangyuanfazhanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
