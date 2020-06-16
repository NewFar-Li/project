package com.xr.service.impl;

import com.xr.entity.Dept;
import com.xr.entity.DeptExample;
import com.xr.entity.Users;
import com.xr.mapper.DeptMapper;
import com.xr.service.DeptService;
import com.xr.util.DeptGroupUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public List<Dept> getGroupDept() {
        {
            DeptExample example = new DeptExample();
            DeptExample.Criteria criteria = example.createCriteria();
            criteria.andDelFlagEqualTo(new Byte("0"));
            List<Dept> deptList = deptMapper.selectByExample(example);
            if(deptList!=null && deptList.size()>0){
                // 进行递归分组
                DeptGroupUtil groupUtil = new DeptGroupUtil();
                deptList = groupUtil.getFirstDept(deptList);
                return deptList;
            }
            return null;
        }
    }
}
