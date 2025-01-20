package com.dao;

import com.entity.DiscussdangyuanfazhanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdangyuanfazhanVO;
import com.entity.view.DiscussdangyuanfazhanView;


/**
 * 党员发展评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-09 21:40:03
 */
public interface DiscussdangyuanfazhanDao extends BaseMapper<DiscussdangyuanfazhanEntity> {
	
	List<DiscussdangyuanfazhanVO> selectListVO(@Param("ew") Wrapper<DiscussdangyuanfazhanEntity> wrapper);
	
	DiscussdangyuanfazhanVO selectVO(@Param("ew") Wrapper<DiscussdangyuanfazhanEntity> wrapper);
	
	List<DiscussdangyuanfazhanView> selectListView(@Param("ew") Wrapper<DiscussdangyuanfazhanEntity> wrapper);

	List<DiscussdangyuanfazhanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdangyuanfazhanEntity> wrapper);
	
	DiscussdangyuanfazhanView selectView(@Param("ew") Wrapper<DiscussdangyuanfazhanEntity> wrapper);
	

}
