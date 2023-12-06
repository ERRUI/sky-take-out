package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.beans.factory.annotation.Autowired;

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
}
