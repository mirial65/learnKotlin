package com.example.kotlintest.sixthstage

/**
 * Description : 解构声明
 * Time : 2020/9/18 15:31
 * Author : zengkun
 */

data class MyResult(val name: String, val age: Int)

fun method(): MyResult {
    return MyResult("zhangsan", 18)
}
//Pair代表可以返回两个结果，它也是data class
fun method2(): Pair<String, Int> {
    return Pair("success", 1)
}
fun main() {
    val (name, age) = method()
    println(name)
    println("---------")
    //泛型可以省略，可以通过类型推断
    val map = mapOf("a" to "1", "b" to "2")
    for ((key, value) in map) {
        println("key= $key, value = $value")
    }
    println("---------")
    //it代表的键值对
    map.mapValues { "${it.value} Hello" }.forEach{ println(it) }
    //解构
    map.mapValues { (_, value) -> "$value world" }.forEach{ println(it) }
}