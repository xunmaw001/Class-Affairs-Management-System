package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdangyuanpeixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdangyuanpeixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdangyuanpeixunView;


/**
 * 党员培训评论表
 *
 * @author 
 * @email 
 * @date 2022-03-09 21:40:03
 */
public interface DiscussdangyuanpeixunService extends IService<DiscussdangyuanpeixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdangyuanpeixunVO> selectListVO(Wrapper<DiscussdangyuanpeixunEntity> wrapper);
   	
   	DiscussdangyuanpeixunVO selectVO(@Param("ew") Wrapper<DiscussdangyuanpeixunEntity> wrapper);
   	
   	List<DiscussdangyuanpeixunView> selectListView(Wrapper<DiscussdangyuanpeixunEntity> wrapper);
   	
   	DiscussdangyuanpeixunView selectView(@Param("ew") Wrapper<DiscussdangyuanpeixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdangyuanpeixunEntity> wrapper);
   	

}

