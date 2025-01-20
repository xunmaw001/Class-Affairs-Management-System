package com.dao;

import com.entity.BanhuizuzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanhuizuzhiVO;
import com.entity.view.BanhuizuzhiView;


/**
 * 班会组织
 * 
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public interface BanhuizuzhiDao extends BaseMapper<BanhuizuzhiEntity> {
	
	List<BanhuizuzhiVO> selectListVO(@Param("ew") Wrapper<BanhuizuzhiEntity> wrapper);
	
	BanhuizuzhiVO selectVO(@Param("ew") Wrapper<BanhuizuzhiEntity> wrapper);
	
	List<BanhuizuzhiView> selectListView(@Param("ew") Wrapper<BanhuizuzhiEntity> wrapper);

	List<BanhuizuzhiView> selectListView(Pagination page,@Param("ew") Wrapper<BanhuizuzhiEntity> wrapper);
	
	BanhuizuzhiView selectView(@Param("ew") Wrapper<BanhuizuzhiEntity> wrapper);
	

}
