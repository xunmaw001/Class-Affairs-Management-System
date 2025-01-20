package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanfeitongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanfeitongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanfeitongzhiView;


/**
 * 班费通知
 *
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public interface BanfeitongzhiService extends IService<BanfeitongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanfeitongzhiVO> selectListVO(Wrapper<BanfeitongzhiEntity> wrapper);
   	
   	BanfeitongzhiVO selectVO(@Param("ew") Wrapper<BanfeitongzhiEntity> wrapper);
   	
   	List<BanfeitongzhiView> selectListView(Wrapper<BanfeitongzhiEntity> wrapper);
   	
   	BanfeitongzhiView selectView(@Param("ew") Wrapper<BanfeitongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanfeitongzhiEntity> wrapper);
   	

}

