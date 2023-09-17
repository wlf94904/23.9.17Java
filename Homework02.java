package com.haha.homework_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author hhm
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car=new Car("宝马",400000);
        Car car1=new Car("宾利",5000000);
        //1.add:添加单个元素
        arrayList.add(car);
        arrayList.add(car1);
        System.out.println(arrayList);
        //2.remove:删除指定元素
        arrayList.remove(car);
        System.out.println(arrayList);

        //3.contains:查找元素是否存在
        System.out.println(arrayList.contains(car));

        //4.size获取元素个数
        System.out.println(arrayList.size());

        //5.isEmpty:判断是否为空
        System.out.println(arrayList.isEmpty());

        //6.clear()清空
//        arrayList.clear();
//        System.out.println(arrayList);

        //7.addAll:添加多个元素
        arrayList.addAll(arrayList);
        System.out.println(arrayList);

        //8.containsAll:查找多个元素是否存在
        arrayList.containsAll(arrayList);

        //9.removeAll:删除多个元素
//        arrayList.removeAll(arrayList);//相当于清空

        //使用增强for和迭代器来遍历所有的car，需要重写Car的toString方法

        for (Object o :arrayList) {
            System.out.println(o);

        }
        System.out.println("===迭代器===");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        


    }
}

class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

