package com.xr.mapper;

import com.xr.entity.SysStaff;

public interface SysStaffMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(SysStaff record);

    int insertSelective(SysStaff record);

    SysStaff selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(SysStaff record);

    int updateByPrimaryKey(SysStaff record);
}