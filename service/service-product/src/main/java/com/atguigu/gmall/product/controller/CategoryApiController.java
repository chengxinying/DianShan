package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.product.bean.BaseCategory1;
import com.atguigu.gmall.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin/product")
public class CategoryApiController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("getCategory1")
    public Result getCategory1() {

        List<BaseCategory1> baseCategory1List = categoryService.getCategory1();
        return Result.ok(baseCategory1List);

    }
}
