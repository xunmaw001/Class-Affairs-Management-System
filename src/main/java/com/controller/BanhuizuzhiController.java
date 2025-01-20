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

import com.entity.BanhuizuzhiEntity;
import com.entity.view.BanhuizuzhiView;

import com.service.BanhuizuzhiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 班会组织
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-09 21:40:02
 */
@RestController
@RequestMapping("/banhuizuzhi")
public class BanhuizuzhiController {
    @Autowired
    private BanhuizuzhiService banhuizuzhiService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BanhuizuzhiEntity banhuizuzhi, 
		HttpServletRequest request){

        EntityWrapper<BanhuizuzhiEntity> ew = new EntityWrapper<BanhuizuzhiEntity>();
		PageUtils page = banhuizuzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banhuizuzhi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BanhuizuzhiEntity banhuizuzhi, 
		HttpServletRequest request){
        EntityWrapper<BanhuizuzhiEntity> ew = new EntityWrapper<BanhuizuzhiEntity>();
		PageUtils page = banhuizuzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banhuizuzhi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BanhuizuzhiEntity banhuizuzhi){
       	EntityWrapper<BanhuizuzhiEntity> ew = new EntityWrapper<BanhuizuzhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( banhuizuzhi, "banhuizuzhi")); 
        return R.ok().put("data", banhuizuzhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BanhuizuzhiEntity banhuizuzhi){
        EntityWrapper< BanhuizuzhiEntity> ew = new EntityWrapper< BanhuizuzhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( banhuizuzhi, "banhuizuzhi")); 
		BanhuizuzhiView banhuizuzhiView =  banhuizuzhiService.selectView(ew);
		return R.ok("查询班会组织成功").put("data", banhuizuzhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BanhuizuzhiEntity banhuizuzhi = banhuizuzhiService.selectById(id);
		banhuizuzhi.setClicknum(banhuizuzhi.getClicknum()+1);
		banhuizuzhi.setClicktime(new Date());
		banhuizuzhiService.updateById(banhuizuzhi);
        return R.ok().put("data", banhuizuzhi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BanhuizuzhiEntity banhuizuzhi = banhuizuzhiService.selectById(id);
		banhuizuzhi.setClicknum(banhuizuzhi.getClicknum()+1);
		banhuizuzhi.setClicktime(new Date());
		banhuizuzhiService.updateById(banhuizuzhi);
        return R.ok().put("data", banhuizuzhi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        BanhuizuzhiEntity banhuizuzhi = banhuizuzhiService.selectById(id);
        if(type.equals("1")) {
        	banhuizuzhi.setThumbsupnum(banhuizuzhi.getThumbsupnum()+1);
        } else {
        	banhuizuzhi.setCrazilynum(banhuizuzhi.getCrazilynum()+1);
        }
        banhuizuzhiService.updateById(banhuizuzhi);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BanhuizuzhiEntity banhuizuzhi, HttpServletRequest request){
    	banhuizuzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banhuizuzhi);

        banhuizuzhiService.insert(banhuizuzhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BanhuizuzhiEntity banhuizuzhi, HttpServletRequest request){
    	banhuizuzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banhuizuzhi);

        banhuizuzhiService.insert(banhuizuzhi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BanhuizuzhiEntity banhuizuzhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(banhuizuzhi);
        banhuizuzhiService.updateById(banhuizuzhi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        banhuizuzhiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<BanhuizuzhiEntity> wrapper = new EntityWrapper<BanhuizuzhiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = banhuizuzhiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,BanhuizuzhiEntity banhuizuzhi, HttpServletRequest request,String pre){
        EntityWrapper<BanhuizuzhiEntity> ew = new EntityWrapper<BanhuizuzhiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = banhuizuzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banhuizuzhi), params), params));
        return R.ok().put("data", page);
    }







}
