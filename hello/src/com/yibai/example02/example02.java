package com.yibai.example02;
/*
静态变量
 */
class Student{
    static String schoolName;//定义静态变量
    static String schoolNull;
}

public class example02 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        //静态成员的调用方式，类名,对象
        Student.schoolName = "河南财政金融学院";
        Student.schoolNull = "郑州龙子湖北路22号";
        System.out.println("我的学校是" + stu1.schoolName + ",它在" + stu1.schoolNull);
        System.out.println("我的学校是" + stu2.schoolName + ",它在" + stu2.schoolNull);
    }
}
