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


import com.dao.DiscussdangyuanpeixunDao;
import com.entity.DiscussdangyuanpeixunEntity;
import com.service.DiscussdangyuanpeixunService;
import com.entity.vo.DiscussdangyuanpeixunVO;
import com.entity.view.DiscussdangyuanpeixunView;

@Service("discussdangyuanpeixunService")
public class DiscussdangyuanpeixunServiceImpl extends ServiceImpl<DiscussdangyuanpeixunDao, DiscussdangyuanpeixunEntity> implements DiscussdangyuanpeixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdangyuanpeixunEntity> page = this.selectPage(
                new Query<DiscussdangyuanpeixunEntity>(params).getPage(),
                new EntityWrapper<DiscussdangyuanpeixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdangyuanpeixunEntity> wrapper) {
		  Page<DiscussdangyuanpeixunView> page =new Query<DiscussdangyuanpeixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdangyuanpeixunVO> selectListVO(Wrapper<DiscussdangyuanpeixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdangyuanpeixunVO selectVO(Wrapper<DiscussdangyuanpeixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdangyuanpeixunView> selectListView(Wrapper<DiscussdangyuanpeixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdangyuanpeixunView selectView(Wrapper<DiscussdangyuanpeixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
