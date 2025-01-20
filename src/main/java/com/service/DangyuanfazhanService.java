package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangyuanfazhanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangyuanfazhanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangyuanfazhanView;


/**
 * 党员发展
 *
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
public interface DangyuanfazhanService extends IService<DangyuanfazhanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangyuanfazhanVO> selectListVO(Wrapper<DangyuanfazhanEntity> wrapper);
   	
   	DangyuanfazhanVO selectVO(@Param("ew") Wrapper<DangyuanfazhanEntity> wrapper);
   	
   	List<DangyuanfazhanView> selectListView(Wrapper<DangyuanfazhanEntity> wrapper);
   	
   	DangyuanfazhanView selectView(@Param("ew") Wrapper<DangyuanfazhanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangyuanfazhanEntity> wrapper);
   	

}

