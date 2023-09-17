package com.haha_.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author hhm
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",20000,new MyDate(1980,12,11)));
        employees.add(new Employee("jack",12000,new MyDate(2001,12,12)));
        employees.add(new Employee("tom",50000,new MyDate(1980,12,10)));

        System.out.println("employess="+employees);


        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if(!(emp1 instanceof Employee&&emp2 instanceof Employee)){
                    System.out.println("类型不正确...");
                    return 0;
                }
                //比较name
                int i=emp1.getName().compareTo(emp2.getName());
                if(i!=0){//i!=0就已经有结果了
                    return i;

                }
                //下面是对Birthday的比较，所以最好把这个比较放到MyDate类完成
                //封装后，将来可维护性和复用性，就大大增强
                return emp1.getBirthday().compareTo(emp2.getBirthday());


            }
        });

        System.out.println("===对雇员进行排序===");
        System.out.println(employees);
    }
}
