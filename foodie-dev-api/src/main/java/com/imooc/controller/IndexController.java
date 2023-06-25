package com.imooc.controller;

import com.imooc.enums.YesOrNO;
import com.imooc.pojo.Carousel;
import com.imooc.service.CarouselService;
import com.imooc.utils.IMOOCJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author :Administrator
 * @path :IndexController
 * @date :2023-06-25 20:03:01
 * @describe :class
 */

@Api(value = "首页", tags = {"首页展示的相关接口"})
@RestController
@RequestMapping(value = "index")
public class IndexController {

    @Autowired
    private CarouselService carouselService;

    final static Logger log = LoggerFactory.getLogger(IndexController.class);

    @ApiOperation(value = "获取首页轮播图列表", notes = "获取首页轮播图列表..", httpMethod = "GET")
    @GetMapping("/carousel")
    public IMOOCJSONResult carousel() {
        List<Carousel> list = carouselService.queryAll(YesOrNO.YES.type);
        return IMOOCJSONResult.ok(list);
    }

}
