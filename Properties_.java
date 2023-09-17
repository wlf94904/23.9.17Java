package com.haha.map_;

import java.util.Properties;

/**
 * @author hhm
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Properties_ {
    public static void main(String[] args) {
        //1.Properties继承了Hashtable，所以不能为空键值对
        //可以通过k-v键值对存放数据，
        //增加
        Properties properties = new Properties();
//        properties.put(null,"abc");//抛出空指针异常
//        properties.put("abc",null);//抛出空指针异常
        properties.put("john",100);//k-v键值对

        properties.put("lucy",100);
        properties.put("lic",100);
        properties.put("lic",88);//如果有相同的key，value被替换
        System.out.println("properties="+properties);

        //通过k，获取对应的值
        System.out.println(properties.get("lic"));

        //删除
        properties.remove("lic");
        System.out.println("properties="+properties);

        //修改
        properties.put("john","约翰");
        System.out.println("properties="+properties);
    }
}
