package com.xr.mapper;

import com.xr.entity.Systemprocess;

public interface SystemprocessMapper {
    int deleteByPrimaryKey(Integer sysid);

    int insert(Systemprocess record);

    int insertSelective(Systemprocess record);

    Systemprocess selectByPrimaryKey(Integer sysid);

    int updateByPrimaryKeySelective(Systemprocess record);

    int updateByPrimaryKey(Systemprocess record);
}