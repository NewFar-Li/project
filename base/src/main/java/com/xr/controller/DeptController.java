package com.xr.controller;

import com.xr.service.DeptService;
import com.xr.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    DeptService deptService;

    @RequestMapping("groupDept")
    public ResponseResult groupDept(){
        ResponseResult result = new ResponseResult();
        result.getData().put("deptList",deptService.getGroupDept());
        return result;
    }
}
