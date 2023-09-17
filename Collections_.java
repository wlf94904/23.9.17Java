package com.haha.Collections_;

import java.util.*;

/**
 * @author hhm
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {

        //创建ArrayList集合，用于测试
        List list=new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("tom");

        //reverst(List):反转List中元素的顺序
        Collections.reverse(list);
        System.out.println("list="+list);

        //shuffer(List):对List集合元素随机排序
//        for(int i=0;i<5;i++){
//            Collections.shuffle(list);
//            System.out.println("list="+list);
//        }

        //sort(List):根据元素的自然顺序对指定List集合元素按升序排序
        Collections.sort(list);
        System.out.println("自然排序后list="+list);

        //sort(List,Comparator):根据指定的Comparator产生的顺序对List集合元素进行排序
        //希望按照字符串的长度大小进行排序
        Collections.sort(list, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                //可以加入校验代码
                if(!(o1 instanceof String)){
                    return 0;
                }
                return ((String)o2).length()-((String)o1).length();

            }

        });
        System.out.println("字符串大小排序："+list);

        //swap(List,int，int）：将指定list集合中的i处元素和j处元素进行交换
        Collections.swap(list,0,1);
        System.out.println("list="+list);

        //Object max(Collection):根据元素的自然排序，返回给定集合中的最大元素
        System.out.println("自然顺序的最大值="+Collections.max(list));
        //Object max(Collection.Comparator):根据Comparator指定的顺序，返回给定集合中的最大元素
        //例：返回长度最大的元素
        Object maxObject=Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (((String)o1).length()-((String)o2).length());
            }
        });
        System.out.println("长度最大的元素="+maxObject);

        //Object min(Collection)
        //Object min(Collection,Comparator)

        //int frequency(Collection,Object):返回指定集合中指定元素的出现次数
        System.out.println("tom的frequency="+Collections.frequency(list,"tom"));

        //void copy(List dest,List src):将src中的内容复制到dest中
        ArrayList dest = new ArrayList();
        //为了完成一个完整拷贝，我们需要先给dest赋值，大小和list.size()一样
        for(int i=0;i<list.size();i++){
            dest.add("");
        }

        //拷贝
        Collections.copy(dest,list);

        System.out.println("dest="+dest);

        //boolean replaceAll(List list,Object oldVal,Object newVal):使用新值替换List对象的所有旧值
        Collections.replaceAll(list,"tom","汤姆");
        System.out.println("list替换后="+list);



    }
}
