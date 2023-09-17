package com.haha_.generic;

/**
 * @author hhm
 * @version 1.0
 */
public class Generic03 {
    public static void main(String[] args) {
        //注意：E表示s的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定了E是什么类型
        Person<String> person = new Person<String>("haha");
        person.show();//String类型

        Person<Integer> person2 = new Person<Integer>(100);
        person2.show();


    }
}

//泛型的作用是：可以在类声明时通过一个标识表示类中某个属性的类型
//或者是某个方法的返回值的类型，或者是参数类型

class Person<E>{
    E s;//E表示s的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定了E是什么类型

    public Person(E s) {//E也可以是参数类型
        this.s = s;
    }

    public E f(){//返回类型使用E
        return s;
    }

    public void show(){
        System.out.println(s.getClass());//显示s的运行类型
    }
}
