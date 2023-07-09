package com.imooc.service;

import com.imooc.pojo.Items;
import com.imooc.pojo.ItemsImg;
import com.imooc.pojo.ItemsParam;
import com.imooc.pojo.ItemsSpec;
import com.imooc.pojo.vo.CommentLevelCountsVO;
import com.imooc.pojo.vo.ShopcartVO;
import com.imooc.utils.PagedGridResult;

import java.util.List;

/**
 * @author :Administrator
 * @path :CategoryService
 * @date :2023-06-25 21:03:13
 * @describe :interface
 */
public interface ItemService {

    /**
     * -根据上平id查询详情
     *
     * @param id -
     * @return -
     */
    Items queryItemById(String id);

    /**
     * 根据商品id查询商品图片列表
     *
     * @param itemId -
     * @return -
     */
    List<ItemsImg> queryItemImgList(String itemId);

    /**
     * 根据商品id 查询 商品 规格
     *
     * @param itemId -
     * @return -
     */
    List<ItemsSpec> queryItemSpecList(String itemId);


    /**
     * 根据商品id 查询 商品 参数
     *
     * @param itemId -
     * @return -
     */
    ItemsParam queryItemParam(String itemId);

    /**
     * 根据商品id查询商品的评价等级数量
     *
     * @param itemId -
     * @return -
     */
    CommentLevelCountsVO queryCommentCounts(String itemId);

    /**
     * 根据商品id查询商品的评价（分页）
     *
     * @param itemId   -
     * @param level    -
     * @param page     -
     * @param pageSize -
     * @return -
     */
    PagedGridResult queryPageComments(String itemId, Integer level, Integer page, Integer pageSize);


    /**
     * 搜索商品列表
     *
     * @param keywords -
     * @param sort     -
     * @param page     -
     * @param pageSize -
     * @return -
     */
    PagedGridResult searchItems(String keywords, String sort, Integer page, Integer pageSize);

    /**
     * 根据分类id搜索商品列表
     *
     * @param catId    -
     * @param sort     -
     * @param page     -
     * @param pageSize -
     * @return -
     */
    PagedGridResult searchItems(Integer catId, String sort, Integer page, Integer pageSize);

    /**
     * 根据规格idsd查询最新的购物车中商品数据（用于刷新渲染购物车中的数据
     *
     * @param specIds
     * @return
     */
    List<ShopcartVO> queryItemsBySpecIds(String specIds);

}
