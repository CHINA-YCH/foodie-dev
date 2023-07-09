package com.imooc.service;

import com.imooc.pojo.Items;
import com.imooc.pojo.ItemsImg;
import com.imooc.pojo.ItemsParam;
import com.imooc.pojo.ItemsSpec;
import com.imooc.pojo.vo.CommentLevelCountsVO;

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
}
