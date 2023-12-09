package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 张尔睿
 * @version 1.0
 */
public interface DishService {

    /**
     * 新增菜品和对应的口味说一句
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 菜品批量删除
     * @param ids
     */
    void deleteBatch(List<Long> ids);
}