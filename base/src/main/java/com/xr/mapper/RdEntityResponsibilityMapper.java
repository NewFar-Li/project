package com.xr.mapper;

import com.xr.entity.RdEntityResponsibility;

public interface RdEntityResponsibilityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdEntityResponsibility record);

    int insertSelective(RdEntityResponsibility record);

    RdEntityResponsibility selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdEntityResponsibility record);

    int updateByPrimaryKeyWithBLOBs(RdEntityResponsibility record);

    int updateByPrimaryKey(RdEntityResponsibility record);
}