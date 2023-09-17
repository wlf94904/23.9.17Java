package com.haha.homework_;

import java.util.*;

/**
 * @author hhm
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack",650);//它自动装箱，把int->Integer
        m.put("tom",1200);
        m.put("smith",2900);
        System.out.println(m);

        m.put("jack",2600);//替换，更新
        System.out.println(m);

        //为所有的员工工资加薪100r
        //keySet或entrySet
        Set keyset = m.keySet();
        for (Object key :keyset) {
            //更新
            m.put(key,(Integer)m.get(key)+100);

        }
        System.out.println(m);

        System.out.println("===遍历===");

        //遍历 EntrySet
        Set entrySet = m.entrySet();
        //迭代器
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        System.out.println("===遍历所有的工资===");
        Collection values = m.values();
        for (Object value :values) {
            System.out.println("工资="+value);
        }


    }
}
