package com.hanyang.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanyang.shortlink.admin.dao.entity.UserDO;
import com.hanyang.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     * @param 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);
}
