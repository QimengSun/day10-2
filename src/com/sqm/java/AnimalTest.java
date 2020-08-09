package com.sqm.java;

import java.sql.SQLOutput;

/**
 * @author: sqm
 * @date: 2020/8/9 21:58
 * @description:
 */

/*
 *
 * 面向对象的特征一 ：封装性
 *
 *
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "Zero";
//        a.age = 1;
//        a.legs = 4;
        a.show();

//        a.legs = -4;
        a.setLegs(6);
        a.show();
    }
}

class Animal{
    String name;
    //------------------------------------------------------
    private int age;//外部无法调用
    //属性设置
    public void setAge(int a){
        if (a >= 0 ) {
            age = a;
        }else{
            age = 0;
        }
    }
    //属性获取
    public int getAge(){
        return age;
    }
    //------------------------------------------------------



    //------------------------------------------------------
    private int legs;//外部无法调用
    //属性设置
    public void setLegs(int l){
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        }else{
            legs = 0;
        }
    }
    //属性获取
    public int getLegs(){
        return legs;
    }
    //------------------------------------------------------


    public void eat() {
        System.out.println("进食！");
    }
    public void show(){
        System.out.println("Name = " + name + ", age = " + age + ",legs = " + legs);
    }
}
