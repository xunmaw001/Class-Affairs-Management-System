package com.dao;

import com.entity.DiscusswenhuaxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswenhuaxuexiVO;
import com.entity.view.DiscusswenhuaxuexiView;


/**
 * 文化学习评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-09 21:40:03
 */
public interface DiscusswenhuaxuexiDao extends BaseMapper<DiscusswenhuaxuexiEntity> {
	
	List<DiscusswenhuaxuexiVO> selectListVO(@Param("ew") Wrapper<DiscusswenhuaxuexiEntity> wrapper);
	
	DiscusswenhuaxuexiVO selectVO(@Param("ew") Wrapper<DiscusswenhuaxuexiEntity> wrapper);
	
	List<DiscusswenhuaxuexiView> selectListView(@Param("ew") Wrapper<DiscusswenhuaxuexiEntity> wrapper);

	List<DiscusswenhuaxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswenhuaxuexiEntity> wrapper);
	
	DiscusswenhuaxuexiView selectView(@Param("ew") Wrapper<DiscusswenhuaxuexiEntity> wrapper);
	

}
