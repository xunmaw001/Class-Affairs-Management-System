package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdangyuanfazhanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdangyuanfazhanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdangyuanfazhanView;


/**
 * 党员发展评论表
 *
 * @author 
 * @email 
 * @date 2022-03-09 21:40:03
 */
public interface DiscussdangyuanfazhanService extends IService<DiscussdangyuanfazhanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdangyuanfazhanVO> selectListVO(Wrapper<DiscussdangyuanfazhanEntity> wrapper);
   	
   	DiscussdangyuanfazhanVO selectVO(@Param("ew") Wrapper<DiscussdangyuanfazhanEntity> wrapper);
   	
   	List<DiscussdangyuanfazhanView> selectListView(Wrapper<DiscussdangyuanfazhanEntity> wrapper);
   	
   	DiscussdangyuanfazhanView selectView(@Param("ew") Wrapper<DiscussdangyuanfazhanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdangyuanfazhanEntity> wrapper);
   	

}

