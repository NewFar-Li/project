package com.xr.service;

import com.xr.entity.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {

    List<Dept> getGroupDept();
}
