package com.xr.mapper;

import com.xr.entity.Processrick;

public interface ProcessrickMapper {
    int deleteByPrimaryKey(Integer proid);

    int insert(Processrick record);

    int insertSelective(Processrick record);

    Processrick selectByPrimaryKey(Integer proid);

    int updateByPrimaryKeySelective(Processrick record);

    int updateByPrimaryKey(Processrick record);
}