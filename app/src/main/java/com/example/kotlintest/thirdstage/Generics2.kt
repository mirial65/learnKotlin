package com.example.kotlintest.thirdstage

/**
 * Description :  协变 covariant  逆变 controvariant
 * Time : 2020/9/14 14:45
 * Author : zengkun
 */

class Generics2<out T, in M>(t: T, m: M) {
    private val name = t
    private var age = m
    fun get(): T = this.name
    fun set(m: M) {
        this.age = m
    }
}

fun myTest(generics: Generics2<String, Number>) {
    //第一次改动：将下面的Generics2<String, Int>改为Generics2<Any, Int>
    //Type mismatch: inferred type is Generics2<String> but Generics2<Any> was expected
    //所以这里就要用到协变，关键字为'out'
    //第二次改动，增加一个泛型M，将上面的Generics2<String, Int>改为Generics2<String, Number>
    //Type mismatch: inferred type is Generics2<String, Number> but Generics2<Any, Int> was expected
    //所以这里就要用到逆变，关键字为'in'
    val myGenerics: Generics2<Any, Int> = generics
    println(myGenerics.get())
}

fun main() {
    myTest(generics = Generics2("zhengkun", 3))
}