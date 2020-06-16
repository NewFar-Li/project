package com.xr.mapper;

import com.xr.entity.DcpReport;

public interface DcpReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DcpReport record);

    int insertSelective(DcpReport record);

    DcpReport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DcpReport record);

    int updateByPrimaryKey(DcpReport record);
}