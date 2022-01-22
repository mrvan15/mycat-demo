package com.fan.mycat.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fan.mycat.entity.SysUser;

/**
 * 系统用户服务类
 */
public interface SysUserService extends IService<SysUser> {
    SysUser findUserByFirstDb(long id);

    SysUser findUserBySecondDb(long id);
}
