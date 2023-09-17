package com.haha.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author hhm
 * @version 1.0
 */
@SuppressWarnings({"all"})

public class TreeSet_ {
    public static void main(String[] args) {

        //1.当使用无参构造器创建TreeSet时，仍然是无序的
        //2.希望添加的元素按照字符串大小进行排序
        //3.使用TreeSet提供的一个构造器，可以传入一个比较器（匿名内部类）
        //  并指定排序规则
//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面调用String的compareTo方法进行字符串大小比较
                return ((String)o2).compareTo((String)o1);
            }
        });

        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");

        System.out.println("treeSet="+treeSet);
    }
}
