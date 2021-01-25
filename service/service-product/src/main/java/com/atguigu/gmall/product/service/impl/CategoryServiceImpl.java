package com.atguigu.gmall.product.service.impl;

import com.atguigu.gmall.product.bean.BaseCategory1;
import com.atguigu.gmall.product.mapper.BaseCategory1Mapper;
import com.atguigu.gmall.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService  {

   @Autowired
   BaseCategory1Mapper baseCategory1Mapper;

      @Override
      public List<BaseCategory1> getCategory1() {
            return baseCategory1Mapper.selectList(null);
     }
}
