package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanhuizuzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanhuizuzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanhuizuzhiView;


/**
 * 班会组织
 *
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public interface BanhuizuzhiService extends IService<BanhuizuzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanhuizuzhiVO> selectListVO(Wrapper<BanhuizuzhiEntity> wrapper);
   	
   	BanhuizuzhiVO selectVO(@Param("ew") Wrapper<BanhuizuzhiEntity> wrapper);
   	
   	List<BanhuizuzhiView> selectListView(Wrapper<BanhuizuzhiEntity> wrapper);
   	
   	BanhuizuzhiView selectView(@Param("ew") Wrapper<BanhuizuzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanhuizuzhiEntity> wrapper);
   	

}

