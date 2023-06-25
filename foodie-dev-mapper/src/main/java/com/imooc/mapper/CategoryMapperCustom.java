package com.imooc.mapper;

import com.imooc.pojo.vo.CategoryVO;
import com.imooc.pojo.vo.NewItemsVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author :Administrator
 * @path :CategoryMapperCustom
 * @date :2023-06-25 21:18:11
 * @describe :interface
 */
@Component
public interface CategoryMapperCustom {
    /**
     * -
     *
     * @param rootCatId -
     * @return -
     */
    public List<CategoryVO> getSubCatList(Integer rootCatId);


    /**
     * -
     *
     * @param map -
     * @return -
     */
    public List<NewItemsVO> getSixNewItemsLazy(@Param("paramsMap") Map<String, Object> map);

}
