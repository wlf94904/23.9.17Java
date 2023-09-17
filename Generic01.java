package com.haha_.generic;

import java.util.ArrayList;

/**
 * @author hhm
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic01 {
    public static void main(String[] args) {
        //使用传统方法解决
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财",10));
        arrayList.add(new Dog("发财",1));
        arrayList.add(new Dog("小黄",5));

        //不小心添加了一只猫
        arrayList.add(new Cat("招财猫",8));

        //遍历
        for (Object o :arrayList) {
            //向下转型Object->Dog
            Dog dog= (Dog) o;
            System.out.println(dog.getName()+"-"+dog.getAge());
        }


    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat{//猫类
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
