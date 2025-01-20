package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangyuanpeixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangyuanpeixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangyuanpeixunView;


/**
 * 党员培训
 *
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public interface DangyuanpeixunService extends IService<DangyuanpeixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangyuanpeixunVO> selectListVO(Wrapper<DangyuanpeixunEntity> wrapper);
   	
   	DangyuanpeixunVO selectVO(@Param("ew") Wrapper<DangyuanpeixunEntity> wrapper);
   	
   	List<DangyuanpeixunView> selectListView(Wrapper<DangyuanpeixunEntity> wrapper);
   	
   	DangyuanpeixunView selectView(@Param("ew") Wrapper<DangyuanpeixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangyuanpeixunEntity> wrapper);
   	

}

