package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 张尔睿
 * @version 1.0
 */
@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品ID查询对应的套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
