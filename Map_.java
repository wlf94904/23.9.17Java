package com.haha.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hhm
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Map_ {
    public static void main(String[] args) {
        //1.Map接口实现类的特点，使用实现类HashMap
        //2。Map与Collection并列存在，用于保存具有映射关系的数据
        //Map中的value可重复
        //3.常用String类作为Map的key
        Map map = new HashMap();
        map.put("No1","哈哈");//k-v
        map.put("No2","张无忌");//k-v
        map.put("No1","张三丰");//k-v，当有相同的k，就等价于替换
        map.put("No3","张三丰");//k-v
        map.put(null,null);//k-v
        map.put(null,"abc");//等价替换
        map.put("no4",null);//k-v
        map.put("no5",null);//k-v
        map.put(1,"赵武");//k-v
        map.put(new Object(),"金毛狮王");//k-v
        //通过get方法，传入key，会返回对应的value
        System.out.println(map.get("No2"));

        System.out.println("map="+map);

    }
}
