package com.imooc.service;

import com.imooc.pojo.Category;
import com.imooc.pojo.vo.CategoryVO;
import com.imooc.pojo.vo.NewItemsVO;

import java.util.List;

/**
 * @author :Administrator
 * @path :CategoryService
 * @date :2023-06-25 21:03:13
 * @describe :interface
 */
public interface CategoryService {

    /**
     * 查询所有一级分类
     *
     * @return -
     */
    List<Category> queryAllRootLevelCat();

    /**
     * 根据一级分类ID 查询子分类
     *
     * @param rootCatId -
     * @return -
     */
    List<CategoryVO> getSubCatList(Integer rootCatId);


    /**
     * 查询首页每个一级分类下的6条最新商品数据
     *
     * @param rootCatId -
     * @return -
     */
    List<NewItemsVO> getSixNewItemsLazy(Integer rootCatId);
}
