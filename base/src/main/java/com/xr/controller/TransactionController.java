package com.xr.controller;

import com.xr.util.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @RequestMapping("list")
    public ResponseResult transactionList(){
        ResponseResult result = new ResponseResult();
        return result;
    }
}
