package com.haha_.generic.CustomGeneric;

/**
 * @author hhm
 * @version 1.0
 */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

//接口中，静态成员也不能使用泛型
interface IA extends Iusb<String ,Double>{

}
//当实现IA接口时，因为IA在继承IUsb接口时，指定了U为String，R为Double
//，在实现IUsb接口的方法时，使用String替换U，用Double替换R
class AA implements IA{

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}
//没有指定类型，默认为Object形式

//实现接口时，直接指定泛型接口的类型
//给U指定Integer，给R指定了Float
//所以，当我们实现IUsb方法时，会使用Integer替换U，使用Float替换R
//class BB implements Iusb<Integer,Float>{
//
//}
interface Iusb<U,R>{
    //普通方法中，可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1,R r2,U u1,U u2);

    //在jdk8中，可以在接口中，使用默认方法,也是可以使用泛型
    default R method(U u){
            return null;
    }
}
//在继承接口，指定泛型接口的类型
