package com.xr.mapper;

import com.xr.entity.SpvDuty;

public interface SpvDutyMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(SpvDuty record);

    int insertSelective(SpvDuty record);

    SpvDuty selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(SpvDuty record);

    int updateByPrimaryKey(SpvDuty record);
}