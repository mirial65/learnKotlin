package com.example.kotlintest.thirdstage

/**
 * Description : 密封类
 * Time : 2020/9/13 21:45
 * Author : zengkun
 */

//密封类（sealed class）它的实质就是java中的抽象类，不能提供非私有的构造方法
//使用密封类的关键好处在于使用 when 表达式 的时候，如果能够验证语句覆盖了所有情况，就不需要为该语句再添加一个 else 子句了
sealed class Calculator
object Add : Calculator()
object Sub : Calculator()

fun calculate(a: Int, b: Int, cal: Calculator): Int {
    //密封类可以被穷尽，所以不需要else语句
    return when (cal) {
        is Add -> a + b
        is Sub -> a - b
    }
}
fun main() {
    println(calculate(1, 2, Add))
}
