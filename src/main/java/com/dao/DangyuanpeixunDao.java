package com.dao;

import com.entity.DangyuanpeixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangyuanpeixunVO;
import com.entity.view.DangyuanpeixunView;


/**
 * 党员培训
 * 
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public interface DangyuanpeixunDao extends BaseMapper<DangyuanpeixunEntity> {
	
	List<DangyuanpeixunVO> selectListVO(@Param("ew") Wrapper<DangyuanpeixunEntity> wrapper);
	
	DangyuanpeixunVO selectVO(@Param("ew") Wrapper<DangyuanpeixunEntity> wrapper);
	
	List<DangyuanpeixunView> selectListView(@Param("ew") Wrapper<DangyuanpeixunEntity> wrapper);

	List<DangyuanpeixunView> selectListView(Pagination page,@Param("ew") Wrapper<DangyuanpeixunEntity> wrapper);
	
	DangyuanpeixunView selectView(@Param("ew") Wrapper<DangyuanpeixunEntity> wrapper);
	

}
