package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    @Id
    private String orderId;

    /** 买家姓名 */
    private String buyerName;

    /** 买家电话 */
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家微信openid */
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态，默认0是新下单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 订单支付状态，默认未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** 订单创建时间 */
    private Date createTime;

    /** 订单更新时间 */
    private Date updateTime;

}
