package com.yibai.domain;

public class Shopping {
    public static void main(String[] args) {
        //创建商品对象，商品名字赋值
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        Product p5 = new Product();

        p1.setProName("电视机");
        p2.setProName("洗衣机");
        p3.setProName("豆浆机");
        p4.setProName("空调机");
        p5.setProName("吹风机");

        //创建超市对象，给超市名字赋值，给仓库赋值
        Market m = new Market();
        m.setMarketName("家乐福");
        m.setProductArr(new Product[]{p1,p2,p3,p4,p5});

        //创建购物者对象
        Person p = new Person();
        p.setName("小明");
        //调用购物者的购物方法，指定超市和商品，得到结果
        Product result = p.shopping(m,"游戏机");
        //根据结果判断
        if (result != null){
            System.out.println(p.getName() + "在" +m.getMarketName() + "买到了" + result.getProName());
        }
        else {
            System.out.println(p.getName() + "白跑一趟，在" + m.getMarketName() + "什么也没买到");
        }
    }
}
