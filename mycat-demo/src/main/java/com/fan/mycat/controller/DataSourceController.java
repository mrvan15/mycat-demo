package com.fan.mycat.controller;

import com.fan.mycat.entity.SysUser;
import com.fan.mycat.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataSourceController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/first")
    public SysUser firstDb(String id){

        return sysUserService.findUserByFirstDb(Long.parseLong(id));
    }

    @GetMapping("/second")
    public SysUser second(String id){

        return sysUserService.findUserBySecondDb(Long.parseLong(id));
    }

}
