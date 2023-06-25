package com.imooc.service;

import com.imooc.pojo.Carousel;

import java.util.List;

/**
 * @author :Administrator
 * @path :CarouselService
 * @date :2023-06-25 19:58:14
 * @describe :interface
 */
public interface CarouselService {
    /**
     * 查询所有轮播图列表
     *
     * @param isShow -
     * @return -
     */
    public List<Carousel> queryAll(Integer isShow);

}
