package com.dao;

import com.entity.DiscussdangyuanpeixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdangyuanpeixunVO;
import com.entity.view.DiscussdangyuanpeixunView;


/**
 * 党员培训评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-09 21:40:03
 */
public interface DiscussdangyuanpeixunDao extends BaseMapper<DiscussdangyuanpeixunEntity> {
	
	List<DiscussdangyuanpeixunVO> selectListVO(@Param("ew") Wrapper<DiscussdangyuanpeixunEntity> wrapper);
	
	DiscussdangyuanpeixunVO selectVO(@Param("ew") Wrapper<DiscussdangyuanpeixunEntity> wrapper);
	
	List<DiscussdangyuanpeixunView> selectListView(@Param("ew") Wrapper<DiscussdangyuanpeixunEntity> wrapper);

	List<DiscussdangyuanpeixunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdangyuanpeixunEntity> wrapper);
	
	DiscussdangyuanpeixunView selectView(@Param("ew") Wrapper<DiscussdangyuanpeixunEntity> wrapper);
	

}
