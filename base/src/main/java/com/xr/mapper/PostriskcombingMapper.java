package com.xr.mapper;

import com.xr.entity.Postriskcombing;

public interface PostriskcombingMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Postriskcombing record);

    int insertSelective(Postriskcombing record);

    Postriskcombing selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Postriskcombing record);

    int updateByPrimaryKey(Postriskcombing record);
}