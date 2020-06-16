package com.xr.mapper;

import com.xr.entity.SysMechanism;

public interface SysMechanismMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(SysMechanism record);

    int insertSelective(SysMechanism record);

    SysMechanism selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(SysMechanism record);

    int updateByPrimaryKey(SysMechanism record);
}