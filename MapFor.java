package com.haha.map_;

import java.util.*;

/**
 * @author hhm
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("邓超",new BooK(" ",100));
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("刘令博",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");
        
        //第一组：先取出所有的key，通过key取出对应的value
        Set keyset = map.keySet();
        //(1)增强for
        System.out.println("---第一种方式---");
        for (Object key :keyset) {
            System.out.println(key+"-"+map.get(key));
        }
        //(2)迭代器,itit快捷键出现while循环
        System.out.println("---第二种方式---");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key+"-"+map.get(key));

        }

        //第二组：把所有的value取出来
        Collection values = map.values();
        //这里可以使用所有Collection使用的遍历方法
        //（1）增强for
        System.out.println("---取出所有的value，增强for---");
        for (Object value :values) {
            System.out.println(value);
        }
        //(2)迭代器
        System.out.println("---取出所有的value，迭代器---");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value =  iterator2.next();
            System.out.println(value);
            
        }

        //第三组：通过EntrySet来获取k-v
        Set entrySet = map.entrySet();//EntrySet<Map.Entry<K,V>>
        //(1)增强for
        System.out.println("---使用EntrySet的增强for（第三种）---");
        for (Object entry :entrySet) {
            //将entry转成Map.Entry
            Map.Entry m=(Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());

        }
        //（2）迭代器
        System.out.println("---使用EntrySet的迭代器（第四种）---");
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()) {
            Object entry =  iterator3.next();
//            System.out.println(entry.getClass());//HashMap$Node-实现->Map.Entry(getKey,getValue)
            //向下转型Map.Entry
            Map.Entry m=(Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());

            
        }



    }
}
