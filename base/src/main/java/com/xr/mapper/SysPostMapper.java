package com.xr.mapper;

import com.xr.entity.SysPost;

public interface SysPostMapper {
    int insert(SysPost record);

    int insertSelective(SysPost record);
}