package com.example.kotlintest.thirdstage

import com.example.kotlintest.BuildConfig

/**
 * Description : kotlin的使用处协变(user-site variance),又叫做类型投影(type projection)
 * kotlin中的Array类就是这样
 * Time : 2020/9/14 20:15
 * Author : zengkun
 */

//数组的浅拷贝
//鉴于下面的错误，要在第一个 Any前加上out
fun copy(from: Array<out Any>, to: Array<Any>) {
    if (BuildConfig.DEBUG && from.size != to.size) {
        error("Assertion failed")
    }
    for (i in from.indices) {
        to[i] = from[i]
        //也是一样的不能写入
//        from[i] = 3
    }
}

fun setValue(to: Array<in String>, index: Int, value: String) {
    to[index] = value
}

fun main() {
    val from: Array<Int> = arrayOf(1, 2, 3, 4)
    val to: Array<Any> = Array(4) { "hello $it" }
    //Type mismatch: inferred type is Array<Int> but Array<Any> was expected
    copy(from, to)
    println("----------")
    val to2: Array<Any> = Array(4) { "world$it" }
    //Type mismatch: inferred type is Array<Any> but Array<String> was expected
    setValue(to2, 3, "hello")

}