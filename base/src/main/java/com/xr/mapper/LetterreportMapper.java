package com.xr.mapper;

import com.xr.entity.Letterreport;

public interface LetterreportMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Letterreport record);

    int insertSelective(Letterreport record);

    Letterreport selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(Letterreport record);

    int updateByPrimaryKey(Letterreport record);
}