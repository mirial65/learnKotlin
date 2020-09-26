package com.example.kotlintest.fifthstage

/**
 * Description : 高阶函数 与 lambda
 * lambda表达式总是被一对花括号所包围
 * 在Kotlin中，如果一个函数的最后一个参数为函数，那么可以将lambda表达式作为实参传递进去，
 * 并且可以在调用时，写在圆括号的外面
 * Time : 2020/9/18 9:25
 * Author : zengkun
 */

//':'后面是类型
val multiply: (Int, Int) -> Int = {a, b -> a * b }
//根据类型推断
val subtract = {a: Int, b: Int -> a - b}
//'_'代表在后面不会用到这个参数
val myReturnNull: (Int, Int) -> Int? = {_, _ -> null}

/*
    高阶函数，指的是函数的参数或返回值是一个函数
 */
//声明
fun myCalculate(a: Int, b: Int, calculate: (Int, Int) -> Int):Int {
    return calculate(a, b)
}
fun myCalculate2(a: Int, b: Int, calculate: (Int, Int) -> Unit): Int {
    calculate(a, b)
    return 12
}
fun myCalculate3(a: Int, b: Int, calculate: (Int, Int) -> Int){
    println(calculate(a, b))
}
fun main() {
    //调用
    myCalculate(2, 3) { x, y -> x + y }
    myCalculate(2, 3) { x, y -> x * y}
    println("-----------")
    val myCalculate2 = myCalculate2(1, 4) { x, y -> println(x + y) }
    println(myCalculate2)
    println("-----------")
    myCalculate3(4, 5) {
         x, y -> x * y
    }
}

