package com.xr.mapper;

import com.xr.entity.RdWorkDeployment;

public interface RdWorkDeploymentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdWorkDeployment record);

    int insertSelective(RdWorkDeployment record);

    RdWorkDeployment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdWorkDeployment record);

    int updateByPrimaryKeyWithBLOBs(RdWorkDeployment record);

    int updateByPrimaryKey(RdWorkDeployment record);
}