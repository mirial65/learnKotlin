package com.example.kotlintest.fifthstage

/**
 * Description : 内联函数(inline function)
 * 假如A方法中调用B方法，那么内联函数就是将B方法的方法体原封不动的拷贝到调用的那个位置，
 * 但如果内联函数多了，这会导致生成的字节码很大。
 * Time : 2020/9/18 9:10
 * Author : zengkun
 */

//这里使用inline会有一个提示
//Expected performance impact from inlining is insignificant. Inlining works best for functions with parameters of functional types
inline fun calculate(a: Int, b: Int) = a + b

fun main() {
    val calculate = calculate(2, 3)
    println(calculate)
}
