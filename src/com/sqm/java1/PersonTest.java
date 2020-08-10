package com.sqm.java1;

import javax.print.DocFlavor;

/**
 * @author: sqm
 * @date: 2020/8/10 15:16
 * @description:
 */

/*
 * this 关键字的使用
 * this 当前对象
 * 可用来修饰属性 方法 构造器
 * 3.this 调用构造器
 * * this(形参列表)、调用其他构造器
 * * 不可调用自己
 * this 必须在首行
 * 必须只能有一个
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.exit(0);

        p1.setAge(10);
        System.out.println(p1.getAge());

        p1.eat();

        System.out.println();

        Person p2 = new Person("Jerry",20);
    }
}

class Person{
    private String name;
    private int age;

    public void setName(String name){//变量n 意义不明确
        //当前对象的属性
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void eat(){
        System.out.println("Eat!");
    }

    //构造器

    public Person(){
        //this.eat();
        String info = "Person初始化";
        System.out.println(info);
    }

    public Person(String name){
        this();
        this.name = name;
    }

    public Person(int age){
        this();
        //指向
//      public Person(){
//         this.eat();
//         String info = "Person初始化";
//         System.out.println(info);
//        }

        this.age = age;
    }

    public Person(String name, int age){
        this(age);
        this.name = name;
        //this.age = age;
    }
}
