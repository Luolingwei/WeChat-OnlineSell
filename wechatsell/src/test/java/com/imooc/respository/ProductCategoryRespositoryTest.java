package com.imooc.respository;

import java.util.*;
import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.transaction.Transactional;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRespositoryTest {
    @Autowired
    private ProductCategoryRepository respository;

    @Test
    @Transactional // 测试回滚，不会对数据库产生影响
    public void saveTest(){
        //新增测试
        ProductCategory productCategory = new ProductCategory("女生最爱",3);
        ProductCategory result=respository.save(productCategory);
        Assert.assertNotNull(result);

        //修改测试1
//        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryId(2);
//        productCategory.setCategoryName("男生最爱");
//        productCategory.setCategoryType(3);
//        respository.save(productCategory);

        //修改测试2
//        ProductCategory productCategory = respository.findById(1).get();
//        productCategory.setCategoryType(10);
//        respository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = respository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }

}