package com.example.kotlintest.firststage

import java.util.*

/**
 * Description :
 * Time : 2020/8/13 10:22
 * Author : zengkun
 */

fun contain() {
    //得到的是list集合
    val array = listOf("hello", "world", "welcome")
    for (item in array) {
        println(item)
    }
    //java来写的话，就要用if
    //kotlin可以用when关键字来写
    when {
        //会调用到contains方法
        "world" in array -> println("world in array")
    }
}

/*
  1，找出长度大于五的元素 ->  可以用filter进行过滤
  2. 符合条件的转换为大写 >  可以用map转化
  3. 将元素进行自然排序
  4. 打印出来
 可以用函数式编程
 */
fun test2() {
    val array = listOf("hello", "world", "hello world", "welcome", "nice")
    //函数式编程  注意都是" { } " 后面会详细讲的
    //it 是 kotlin的语法糖，代表当前遍历的元素
    //java的话，要这样{it -> it.length > 5}
    array.filter { it.length > 5 }
        .map { it.toUpperCase(Locale.ROOT) }
        .sorted()
        .forEach { println(it) }
}
fun main() {
    contain()
    test2()
}