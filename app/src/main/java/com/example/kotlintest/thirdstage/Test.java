package com.example.kotlintest.thirdstage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Description : 测试协变
 * Time : 2020/9/14 10:59
 * Author : zengkun
 */
public class Test {
    //注意Collection是个接口,按'ctrl + h'查看它的子类
    public static void copyAll(Collection<Object> to, Collection<String> from) {
        to.addAll(from);
    }

    public static void main(String[] args) {
        List<String> from = new ArrayList<>();
        from.add("hello");
        from.add("world");
        from.add("welcome");
        List<Object> to = new ArrayList<>();
        to.add(1);
        to.add(2);
        to.add("afa");
        copyAll(to, from);
        //get方法得到的时Object类型的，而不是String类型的
        Object o = to.get(0);
        System.out.println(to);
    }
}
