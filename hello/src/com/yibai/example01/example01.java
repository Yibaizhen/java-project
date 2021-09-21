package com.yibai.example01;
/*
this关键字
本来对象引用

 */
class Person{
    private String name ;
    public Person (String name){
        this.name = name ;
    }
    public void speak(){
        System.out.println("我叫" + name);
    }
}
public class example01 {
    public static void main(String[] args) {
        Person p = new Person("韩强");
        p.speak();
    }
}
