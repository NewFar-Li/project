package com.xr.mapper;

import com.xr.entity.Riskevaluate;

public interface RiskevaluateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Riskevaluate record);

    int insertSelective(Riskevaluate record);

    Riskevaluate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Riskevaluate record);

    int updateByPrimaryKey(Riskevaluate record);
}