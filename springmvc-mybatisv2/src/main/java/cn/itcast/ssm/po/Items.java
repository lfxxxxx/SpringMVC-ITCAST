package cn.itcast.ssm.po;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
@author LFX
@create 2019-08-06 17:23
*/

@Getter
@Setter
public class Items {
    private Integer id;

    /**
    * 商品名称
    */
    private String name;

    /**
    * 商品定价
    */
    private Double price;

    /**
    * 商品描述
    */
    private String detail;

    /**
    * 商品图片
    */

    private String pic;

    /**
    * 生产日期
    */
    private Date createtime;

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", pic='" + pic + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}