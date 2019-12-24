package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import com.imooc.respository.ProductCategoryRespository;
import com.imooc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRespository respository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return respository.findById(categoryId).get();
    }

    @Override
    public List<ProductCategory> finaAll() {
        return respository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return respository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return respository.save(productCategory);
    }
}
