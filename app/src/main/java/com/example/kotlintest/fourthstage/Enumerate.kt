package com.example.kotlintest.fourthstage

/**
 * Description : 枚举（enum class）,特殊的类，类的对象已经确定了
 * Time : 2020/9/15 18:55
 * Author : zengkun
 */

enum class Season{
    SPRING, SUMMER, AUTUMN, WINTER;
    fun getSeason(season: Season): Season{
        return season
    }
}

fun main() {
    val season = Season.values()
    season.forEach { println(it) }

}