package com.dao;

import com.entity.DangyuanfazhanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangyuanfazhanVO;
import com.entity.view.DangyuanfazhanView;


/**
 * 党员发展
 * 
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public interface DangyuanfazhanDao extends BaseMapper<DangyuanfazhanEntity> {
	
	List<DangyuanfazhanVO> selectListVO(@Param("ew") Wrapper<DangyuanfazhanEntity> wrapper);
	
	DangyuanfazhanVO selectVO(@Param("ew") Wrapper<DangyuanfazhanEntity> wrapper);
	
	List<DangyuanfazhanView> selectListView(@Param("ew") Wrapper<DangyuanfazhanEntity> wrapper);

	List<DangyuanfazhanView> selectListView(Pagination page,@Param("ew") Wrapper<DangyuanfazhanEntity> wrapper);
	
	DangyuanfazhanView selectView(@Param("ew") Wrapper<DangyuanfazhanEntity> wrapper);
	

}
