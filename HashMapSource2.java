package com.haha.map_;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author hhm
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashMapSource2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for(int i=1;i<=12;i++){
            hashMap.put(new A(i),"hello");
        }
        System.out.println("hashMap="+hashMap);



    }
}

class A{
    private int A;

    public A(int a) {
        A = a;
    }

//所有的A对象的hashCode都是100
    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "\nA{" +
                "A=" + A +
                '}';
    }
}

