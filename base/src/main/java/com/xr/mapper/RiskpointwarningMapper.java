package com.xr.mapper;

import com.xr.entity.Riskpointwarning;

public interface RiskpointwarningMapper {
    int deleteByPrimaryKey(Integer wid);

    int insert(Riskpointwarning record);

    int insertSelective(Riskpointwarning record);

    Riskpointwarning selectByPrimaryKey(Integer wid);

    int updateByPrimaryKeySelective(Riskpointwarning record);

    int updateByPrimaryKey(Riskpointwarning record);
}