package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusswenhuaxuexiEntity;
import com.entity.view.DiscusswenhuaxuexiView;

import com.service.DiscusswenhuaxuexiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 文化学习评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-09 21:40:03
 */
@RestController
@RequestMapping("/discusswenhuaxuexi")
public class DiscusswenhuaxuexiController {
    @Autowired
    private DiscusswenhuaxuexiService discusswenhuaxuexiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusswenhuaxuexiEntity discusswenhuaxuexi, 
		HttpServletRequest request){

        EntityWrapper<DiscusswenhuaxuexiEntity> ew = new EntityWrapper<DiscusswenhuaxuexiEntity>();
		PageUtils page = discusswenhuaxuexiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusswenhuaxuexi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusswenhuaxuexiEntity discusswenhuaxuexi, 
		HttpServletRequest request){
        EntityWrapper<DiscusswenhuaxuexiEntity> ew = new EntityWrapper<DiscusswenhuaxuexiEntity>();
		PageUtils page = discusswenhuaxuexiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusswenhuaxuexi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusswenhuaxuexiEntity discusswenhuaxuexi){
       	EntityWrapper<DiscusswenhuaxuexiEntity> ew = new EntityWrapper<DiscusswenhuaxuexiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusswenhuaxuexi, "discusswenhuaxuexi")); 
        return R.ok().put("data", discusswenhuaxuexiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusswenhuaxuexiEntity discusswenhuaxuexi){
        EntityWrapper< DiscusswenhuaxuexiEntity> ew = new EntityWrapper< DiscusswenhuaxuexiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusswenhuaxuexi, "discusswenhuaxuexi")); 
		DiscusswenhuaxuexiView discusswenhuaxuexiView =  discusswenhuaxuexiService.selectView(ew);
		return R.ok("查询文化学习评论表成功").put("data", discusswenhuaxuexiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusswenhuaxuexiEntity discusswenhuaxuexi = discusswenhuaxuexiService.selectById(id);
        return R.ok().put("data", discusswenhuaxuexi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusswenhuaxuexiEntity discusswenhuaxuexi = discusswenhuaxuexiService.selectById(id);
        return R.ok().put("data", discusswenhuaxuexi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusswenhuaxuexiEntity discusswenhuaxuexi, HttpServletRequest request){
    	discusswenhuaxuexi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusswenhuaxuexi);

        discusswenhuaxuexiService.insert(discusswenhuaxuexi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusswenhuaxuexiEntity discusswenhuaxuexi, HttpServletRequest request){
    	discusswenhuaxuexi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusswenhuaxuexi);

        discusswenhuaxuexiService.insert(discusswenhuaxuexi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusswenhuaxuexiEntity discusswenhuaxuexi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusswenhuaxuexi);
        discusswenhuaxuexiService.updateById(discusswenhuaxuexi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusswenhuaxuexiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusswenhuaxuexiEntity> wrapper = new EntityWrapper<DiscusswenhuaxuexiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusswenhuaxuexiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
