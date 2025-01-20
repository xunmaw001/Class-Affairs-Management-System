package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbanhuizuzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbanhuizuzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbanhuizuzhiView;


/**
 * 班会组织评论表
 *
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public interface DiscussbanhuizuzhiService extends IService<DiscussbanhuizuzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbanhuizuzhiVO> selectListVO(Wrapper<DiscussbanhuizuzhiEntity> wrapper);
   	
   	DiscussbanhuizuzhiVO selectVO(@Param("ew") Wrapper<DiscussbanhuizuzhiEntity> wrapper);
   	
   	List<DiscussbanhuizuzhiView> selectListView(Wrapper<DiscussbanhuizuzhiEntity> wrapper);
   	
   	DiscussbanhuizuzhiView selectView(@Param("ew") Wrapper<DiscussbanhuizuzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbanhuizuzhiEntity> wrapper);
   	

}

