package com.example.kotlintest.firststage

import java.util.*

/**
 * Description :
 * Time : 2020/8/12 11:46
 * Author : zengkun
 */
//将字符串转换为整型,可能抛异常
//返回类型为Int?：就是说返回类型为Int,但可以为空（null）
//如果返回类型为Int：就是说返回类型只能为Int，不能为空
fun convertToInt(s: String): Int? {
    //能return try， 是因为他是表达式
    return try {
        s.toInt()
    } catch (ex: Exception) {
        null
    }
}

/*
   注意这里是没有返回值的
 */
fun printMultiply(a: String, b: String) {
    val intA = convertToInt(a)
    val intB = convertToInt(b)
    if (intA != null && intB != null) {
        println(intA * intB)
    } else
        println("params is null")

}

/*
  将字符串转换为大写
  Any相当于java中的Object的地位
  is是kotlin的语法糖，相当于java中的instanceOf
 */
fun convertUpperCase(str: Any): String? {
    if (str is String) {
        //如果是java，那么这里还要先强转。
        return str.toUpperCase(Locale.ROOT)
    }
    return null
}

/*
   IntArray代表java中的int数组
   遍历的三种方式
 */
fun traversal() {
    //数组
    val array = intArrayOf(1, 2, 3, 3)
    //遍历元素
    for (item in array) {
        println(item)
    }
    //遍历索引
    //indices是index的复数，代表下标
    for (i: Int in array.indices) {
        //字符串模板很好用，可以代替java中的占位符或拼接操作
        //其实就是把$后面的变为真实的值
        println("array[$i] = ${array[i]}")
    }
    //同时遍历下标和索引
    for ((index, value) in array.withIndex()) {
        println("array[$index] = $value")
    }
}

fun main() {
    println(convertToInt("2"))
    println(convertToInt("a"))
    printMultiply("2", "5")
    printMultiply("2", "b")
    println(convertUpperCase("hello world"))
    println(convertUpperCase("1245322"))
    traversal()
}

