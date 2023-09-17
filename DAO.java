package com.haha_.homework_;

import java.util.*;

/**
 * @author hhm
 * @version 1.0
 */
public class DAO<T> {//泛型类
    private Map<String,T> map=new HashMap<>();

    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    //返回map中存放的所有T对象
    //遍历map[k-v]，将map的所有value（T entity），封装到ArrayList返回即可
    public List<T> list(){
        //创建ArrayList
        List<T> list=new ArrayList<>();

        //遍历map
        Set<String> keySet = map.keySet();
        for (String key:keySet) {
            //map.get(key)返回的就是User对象->ArrayList
            list.add(map.get(key));

        }


        return list;

    }
    public void delete(String id){
        map.remove(id);
    }
    public void save(String id,T entity){//把entity保存到map
        map.put(id,entity);
    }
}
