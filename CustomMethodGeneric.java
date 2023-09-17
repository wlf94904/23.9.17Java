package com.haha_.generic.CustomGeneric;

/**
 * @author hhm
 * @version 1.0
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马",100);//当调用方法时，传入参数，编译器就会确定类型
        System.out.println("====================");
        car.fly(300,100.1);

    }
}

class Car{//普通类
    public void run(){//普通方法

    }
    //<T,R>就是泛型
    //是提供给fly使用的
    public<T,R> void fly(T t,R r){//泛型方法
        System.out.println(t.getClass());//String
        System.out.println(r.getClass());//Integer
    }


}
class Fish<T,R>{//泛型类
    public void run(){//普通方法

    }
    public<U,M> void eat(U u,M m){//泛型方法

    }
    //说明
    //1.下面hi方法不是泛型方法
    //2.是hi方法使用了类声明的泛型
    public void hi(T t){

    }
    //泛型方法，可以使用类声明的泛型，也可以使用自己声明泛型
    public<K> void hello(R r,K k){

    }
}
