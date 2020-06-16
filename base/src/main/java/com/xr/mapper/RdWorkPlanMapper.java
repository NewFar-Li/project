package com.xr.mapper;

import com.xr.entity.RdWorkPlan;

public interface RdWorkPlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdWorkPlan record);

    int insertSelective(RdWorkPlan record);

    RdWorkPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdWorkPlan record);

    int updateByPrimaryKeyWithBLOBs(RdWorkPlan record);

    int updateByPrimaryKey(RdWorkPlan record);
}