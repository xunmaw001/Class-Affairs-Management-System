package com.dao;

import com.entity.DiscussbanhuizuzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbanhuizuzhiVO;
import com.entity.view.DiscussbanhuizuzhiView;


/**
 * 班会组织评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public interface DiscussbanhuizuzhiDao extends BaseMapper<DiscussbanhuizuzhiEntity> {
	
	List<DiscussbanhuizuzhiVO> selectListVO(@Param("ew") Wrapper<DiscussbanhuizuzhiEntity> wrapper);
	
	DiscussbanhuizuzhiVO selectVO(@Param("ew") Wrapper<DiscussbanhuizuzhiEntity> wrapper);
	
	List<DiscussbanhuizuzhiView> selectListView(@Param("ew") Wrapper<DiscussbanhuizuzhiEntity> wrapper);

	List<DiscussbanhuizuzhiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbanhuizuzhiEntity> wrapper);
	
	DiscussbanhuizuzhiView selectView(@Param("ew") Wrapper<DiscussbanhuizuzhiEntity> wrapper);
	

}
