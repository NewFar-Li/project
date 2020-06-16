package com.xr.mapper;

import com.xr.entity.Supervisionfiling;

public interface SupervisionfilingMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Supervisionfiling record);

    int insertSelective(Supervisionfiling record);

    Supervisionfiling selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Supervisionfiling record);

    int updateByPrimaryKey(Supervisionfiling record);
}