package com.xr.mapper;

import com.xr.entity.Creditrating;

public interface CreditratingMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Creditrating record);

    int insertSelective(Creditrating record);

    Creditrating selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Creditrating record);

    int updateByPrimaryKey(Creditrating record);
}