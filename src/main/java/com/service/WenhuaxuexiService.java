package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenhuaxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenhuaxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenhuaxuexiView;


/**
 * 文化学习
 *
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public interface WenhuaxuexiService extends IService<WenhuaxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenhuaxuexiVO> selectListVO(Wrapper<WenhuaxuexiEntity> wrapper);
   	
   	WenhuaxuexiVO selectVO(@Param("ew") Wrapper<WenhuaxuexiEntity> wrapper);
   	
   	List<WenhuaxuexiView> selectListView(Wrapper<WenhuaxuexiEntity> wrapper);
   	
   	WenhuaxuexiView selectView(@Param("ew") Wrapper<WenhuaxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenhuaxuexiEntity> wrapper);
   	

}

