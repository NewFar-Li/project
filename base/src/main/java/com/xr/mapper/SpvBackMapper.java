package com.xr.mapper;

import com.xr.entity.SpvBack;

public interface SpvBackMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(SpvBack record);

    int insertSelective(SpvBack record);

    SpvBack selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(SpvBack record);

    int updateByPrimaryKey(SpvBack record);
}