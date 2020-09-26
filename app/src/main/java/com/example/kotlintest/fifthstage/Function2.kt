package com.example.kotlintest.fifthstage

/**
 * Description : 使用函数需要注意的地方
 * Time : 2020/9/16 15:53
 * Author : zengkun
 */

/*
    单表达式函数
 */
fun add(a: Int, b: Int) = a + b

/*
   显示返回类型
   拥有方法体的函数需要显示指定函数的返回类型,除非返回Unit
   因为这种函数可能拥有非常复杂的控制流程
 */
fun multiply(a: Int, b: Int): Int {
    return a * b
}

/*
   一个方法中，只允许一个参数为可变参数，通常为最后一个参数，如果vararg不是最后一个参数
   那么其后的 参数就需要具名参数的形式传递
 */
fun <T> convert2List(vararg elements: T): List<T> {
    val result = arrayListOf<T>();
    elements.forEach { result.add(it)}
    return result;
}

fun main() {
    val elements = arrayOf("hello", "world", "welcome")
    println(convert2List(*elements))

}