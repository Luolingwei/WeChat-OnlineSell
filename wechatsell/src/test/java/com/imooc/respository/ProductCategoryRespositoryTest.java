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

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRespositoryTest {
    @Autowired
    private ProductCategoryRespository respository;

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("女生最爱",3);
        ProductCategory result=respository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = respository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }

}