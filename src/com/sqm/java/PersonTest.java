package com.sqm.java;

/**
 * @author: sqm
 * @date: 2020/8/9 22:32
 * @description:
 */
public class PersonTest {
    public static void main(String[] args) {
        // new + 类型 + 构造器
        Person p = new Person(); //()为构造器

    }
}

class Person{
    //属性
    String name;
    int age;

    //构造器
    public Person(){

    }

    //方法
    public void eat(){
        System.out.println("Eat");
    }
    public void talk(){
        System.out.println("hahahaha");
    }


}
