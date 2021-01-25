package com.atguigu.gmall.product.mapper;

import com.atguigu.gmall.product.bean.BaseCategory1;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseCategory1Mapper extends BaseMapper<BaseCategory1> {
    List<BaseCategory1> getCategory1();
}
