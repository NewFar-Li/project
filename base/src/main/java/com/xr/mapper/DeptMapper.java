package com.xr.mapper;


import com.xr.entity.Dept;
import com.xr.entity.DeptExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptMapper {

    List<Dept> selectByExample(DeptExample example);

}
