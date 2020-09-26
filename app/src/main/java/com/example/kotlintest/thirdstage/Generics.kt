package com.example.kotlintest.thirdstage

/**
 * Description : kotlin泛型
 * Time : 2020/8/14 15:09
 * Author : zengkun
 */

//泛型，表示变量类型参数化
class Generics<T>(t: T){
    var variable = t
}

fun main() {
    val generics = Generics("hello")    //借助于kotlin的类型推断,能根据参数t推断出来泛型T
    println(generics.variable)
}
