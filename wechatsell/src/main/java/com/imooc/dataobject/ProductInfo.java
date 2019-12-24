package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    /** 商品名字 */
    private String productName;

    /** 商品价格 */
    private BigDecimal productPrice;

    /** 商品库存 */
    private Integer productStock;

    /** 商品描述 */
    private String productDescription;

    /** 商品小图 */
    private String productIcon;

    /** 商品状态，0上架、1下架 */
    private Integer productStatus;

    /** 商品类目 */
    private Integer categoryType;

    /** 创建日期 */
    private Date createTime;
    /** 更新日期 */
    private Date updateTime;

}
