package com.dao;

import com.entity.WenhuaxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenhuaxuexiVO;
import com.entity.view.WenhuaxuexiView;


/**
 * 文化学习
 * 
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public interface WenhuaxuexiDao extends BaseMapper<WenhuaxuexiEntity> {
	
	List<WenhuaxuexiVO> selectListVO(@Param("ew") Wrapper<WenhuaxuexiEntity> wrapper);
	
	WenhuaxuexiVO selectVO(@Param("ew") Wrapper<WenhuaxuexiEntity> wrapper);
	
	List<WenhuaxuexiView> selectListView(@Param("ew") Wrapper<WenhuaxuexiEntity> wrapper);

	List<WenhuaxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<WenhuaxuexiEntity> wrapper);
	
	WenhuaxuexiView selectView(@Param("ew") Wrapper<WenhuaxuexiEntity> wrapper);
	

}
