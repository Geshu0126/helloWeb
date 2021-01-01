package com.shuker.domain;

import java.util.Date;

/**
 * @ClassName Items
 * @Description TODO
 * @Author Shuker
 * @Date 2021/1/1 11:05
 * @Version 1.0
 **/
public class Items {
    private Integer id ;
    private String name ;
    private Double price ;
    private String pic ;
    private Date createTime ;
    private String detail ;

    public Items() {
    }

    public Items(Integer id, String name, Double price, String pic, Date createTime, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pic = pic;
        this.createTime = createTime;
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", pic='" + pic + '\'' +
                ", createTime=" + createTime +
                ", detail='" + detail + '\'' +
                '}';
    }
}
