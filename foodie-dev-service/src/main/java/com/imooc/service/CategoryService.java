package com.imooc.service;

import com.imooc.pojo.Category;
import com.imooc.pojo.vo.CategoryVO;

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
    public List<Category> queryAllRootLevelCat();

    /**
     * 根据一级分类ID 查询子分类
     *
     * @param rootCatId -
     * @return -
     */
    public List<CategoryVO> getSubCatList(Integer rootCatId);
}
