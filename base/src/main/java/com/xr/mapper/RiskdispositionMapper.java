package com.xr.mapper;

import com.xr.entity.Riskdisposition;

public interface RiskdispositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Riskdisposition record);

    int insertSelective(Riskdisposition record);

    Riskdisposition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Riskdisposition record);

    int updateByPrimaryKey(Riskdisposition record);
}