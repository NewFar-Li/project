package com.xr.mapper;

import com.xr.entity.SysPostPermission;

public interface SysPostPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysPostPermission record);

    int insertSelective(SysPostPermission record);

    SysPostPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysPostPermission record);

    int updateByPrimaryKey(SysPostPermission record);
}