package com.yibai.domain1;
/*
构造方法的重载
 */
class Person{
    private String name ;
    private int age ;
    //定义两个参数的构造方法
    public Person(String con_name,int con_age){
        name = con_name;
        age = con_age;
    }
    public void speak(){
        //打印name和age
        System.out.println("大家好，我叫" + name + ",我今年" + age + "岁了");
    }
}
public class Students{
    public static void main(String[] args) {
        //分别创建两个对象p1和p2
        Person p1 = new Person("韩强",28);
        Person p2 = new Person("小英",27);
        //通过对象P1和p2调用speak()方法
        p1.speak();
        p2.speak();
    }
}
