package com.example.kotlintest.thirdstage

/**
 * Description : kotlin：声明处协变，java：使用处协变
 * Time : 2020/9/14 16:30
 * Author : zengkun
 */

/*
注意：这在java中并不是协变
      class A<T extends Object> {

      }
*/

/*
    produce = output = out
    对于out泛型来说，我们可以将子类型的对象赋给父类型引用
    可以差不多的理解为out泛型和多态   写法上差不多吧
 */
interface Produce<out T> {
    fun produce(): T
}

/*
    consumer = input = in
    对于in泛型来说，我们可以将父类型的对象赋给子类型引用

 */
interface Consumer<in T> {
    fun consumer(t: T)
}

