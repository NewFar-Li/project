package com.xr.mapper;

import com.xr.entity.Datacollection;

public interface DatacollectionMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Datacollection record);

    int insertSelective(Datacollection record);

    Datacollection selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Datacollection record);

    int updateByPrimaryKey(Datacollection record);
}