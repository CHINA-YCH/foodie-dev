package com.imooc.mapper;

import com.imooc.pojo.vo.CategoryVO;
import org.springframework.stereotype.Component;

import java.util.List;

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
}
