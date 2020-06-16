package com.xr.mapper;

import com.xr.entity.Riskpointassessment;

public interface RiskpointassessmentMapper {
    int deleteByPrimaryKey(Integer riskid);

    int insert(Riskpointassessment record);

    int insertSelective(Riskpointassessment record);

    Riskpointassessment selectByPrimaryKey(Integer riskid);

    int updateByPrimaryKeySelective(Riskpointassessment record);

    int updateByPrimaryKey(Riskpointassessment record);
}