package com.fan.mycat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fan.mycat.datasource.DataSourceNames;
import com.fan.mycat.datasource.TargetDataSource;
import com.fan.mycat.entity.SysUser;
import com.fan.mycat.mapper.SysUserMapper;
import com.fan.mycat.service.SysUserService;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper,SysUser> implements SysUserService {
    @Override
    public SysUser findUserByFirstDb(long id) {
        return this.baseMapper.selectById(id);
    }

    @TargetDataSource(name = DataSourceNames.SECOND)
    @Override
    public SysUser findUserBySecondDb(long id) {
        return this.baseMapper.selectById(id);
    }
}
