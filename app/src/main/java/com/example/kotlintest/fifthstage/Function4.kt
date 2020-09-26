package com.example.kotlintest.fifthstage

/**
 * Description : 扩展函数 + 函数式编程
 * Time : 2020/9/18 13:07
 * Author : zengkun
 */

/*
    要求：用Kotlin的扩展函数，写一个用于自定义过滤字符串的方法(自定义代表的是要在函数执行时才知道过滤的要求)
    注意：Kotlin中一切皆对象，所以在这里this可以代表str对象
 */
fun String.filter(predicate: (Char) -> Boolean): String {
    var sb: StringBuilder = StringBuilder()
    //第一种方法
//    for (i in this) {
//        if (predicate(i)) {
//            sb.append(i)
//        }
//    }
    //第二种方法
    for (index in 0 until length) {
        var element = get(index)
        if (predicate(element)) {
            sb.append(element)
        }
    }
    return sb.toString()
}
fun main() {
    val str = "aaga8e43gf"
    //如果只有一个参数，可以用it表示
    val filter = str.filter { it.isLetter() }
    println(filter)
    val str2 = "hello World88!I love"
    //如果只有一个参数，可以用it表示
    val filter2 = str2.filter { it.isDigit() }
    println(filter2)
}