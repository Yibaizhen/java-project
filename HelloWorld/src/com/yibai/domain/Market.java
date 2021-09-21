package com.yibai.domain;
/*
定义一个超市类
描述超市名字
超市事物
超市仓库，存储商品
售货方法
 */
public class Market {
    public String marketName ; //超市名字
    public Product[] productArr ; //仓库，存储商品，里面存储若干商品
    public String getMarketName(){
        return marketName;
    }
    public void setMarketName(String marketName){
        this.marketName = marketName;
    }
    public Product[] getProductArr(){
        return productArr;
    }
    public void setProductArr(Product[] productArr){
        this.productArr = productArr;
    }
    public Product sell(String name){//卖货，指定商品名字
        for (int i = 0 ; i < productArr.length ; i++){//遍历仓库商品
            if (productArr[i].getProName() == name){//如果找到名字和要买的商品一样
                return productArr[i];//返回该商品
            }
        }
        return null;
    }
}
