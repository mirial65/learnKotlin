package com.example.kotlintest.secondstage

import java.util.*

/**
 * Description : 扩展类
 * Time : 2020/9/9 16:17
 * Author : zengkun
 */

/**
 * 自定义的扩展类
 * 这就是用扩展函数为List类新增一个swap方法
 * 注意要写在顶层上，即它要和最外层的类处于同一级
 */

fun <T> List<T>.swap(a: Int, b: Int) {
    Collections.swap(list, a, b)
}
