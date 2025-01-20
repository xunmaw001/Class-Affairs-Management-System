package com.dao;

import com.entity.BanfeitongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanfeitongzhiVO;
import com.entity.view.BanfeitongzhiView;


/**
 * 班费通知
 * 
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public interface BanfeitongzhiDao extends BaseMapper<BanfeitongzhiEntity> {
	
	List<BanfeitongzhiVO> selectListVO(@Param("ew") Wrapper<BanfeitongzhiEntity> wrapper);
	
	BanfeitongzhiVO selectVO(@Param("ew") Wrapper<BanfeitongzhiEntity> wrapper);
	
	List<BanfeitongzhiView> selectListView(@Param("ew") Wrapper<BanfeitongzhiEntity> wrapper);

	List<BanfeitongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<BanfeitongzhiEntity> wrapper);
	
	BanfeitongzhiView selectView(@Param("ew") Wrapper<BanfeitongzhiEntity> wrapper);
	

}
