package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswenhuaxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswenhuaxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswenhuaxuexiView;


/**
 * 文化学习评论表
 *
 * @author 
 * @email 
 * @date 2022-03-09 21:40:03
 */
public interface DiscusswenhuaxuexiService extends IService<DiscusswenhuaxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswenhuaxuexiVO> selectListVO(Wrapper<DiscusswenhuaxuexiEntity> wrapper);
   	
   	DiscusswenhuaxuexiVO selectVO(@Param("ew") Wrapper<DiscusswenhuaxuexiEntity> wrapper);
   	
   	List<DiscusswenhuaxuexiView> selectListView(Wrapper<DiscusswenhuaxuexiEntity> wrapper);
   	
   	DiscusswenhuaxuexiView selectView(@Param("ew") Wrapper<DiscusswenhuaxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswenhuaxuexiEntity> wrapper);
   	

}

