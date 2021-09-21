package com.yibai.domain;
/*
定义了一个人类
描述人这个属性
人的名字
购物功能
 */
public class Person {
    public String name ; //人名
    public String getName(){
        return name ;
    }
    public void setName(String name){
        this.name = name;
    }

    public Product shopping(Market market, String name){//购物，指定去哪个超市，商品名
        return market.sell(name);//调用超市的卖货方法，指定商品名称，把卖出去货的结果返回
    }
}
