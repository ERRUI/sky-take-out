package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * @author 张尔睿
 * @version 1.0
 */
public interface UserService {

    User wxLogin(UserLoginDTO userLoginDTO);
}
