package com.xr.mapper;

import com.xr.entity.EducationPolitics;

public interface EducationPoliticsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EducationPolitics record);

    int insertSelective(EducationPolitics record);

    EducationPolitics selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EducationPolitics record);

    int updateByPrimaryKeyWithBLOBs(EducationPolitics record);

    int updateByPrimaryKey(EducationPolitics record);
}