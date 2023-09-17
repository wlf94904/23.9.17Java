package com.haha_.homework_;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author hhm
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        //给T指定类型是User
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,18,"king"));
        dao.save("003",new User(3,38,"smith"));

        List<User> list = dao.list();

        System.out.println("list="+list);

        dao.update("003",new User(3,58,"milan"));
        System.out.println("===修改后===");
        list=dao.list();
        System.out.println("list="+list);
    }
}
/*
思路：
1.定义User类
2.定义Dao<T>泛型类
 */
