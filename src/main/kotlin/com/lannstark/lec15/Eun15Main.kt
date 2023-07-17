package com.lannstark.lec15

fun main() {

    val arrayEx = arrayOf(100, 200)
    val array = arrayEx.plus(300)

    for(i in array.indices) {
        println("${i} ${array[i]}")
    }

    for((index, value) in array.withIndex()) {
        println("$index $value")
    }
    
    val list = listOf(100, 200) // 불변 List
    val list2 = mutableListOf(100, 200)   // 가변 List
    val emptyList = emptyList<Int>()

    val map = mutableMapOf<Int, String>()    // 가변 map
    map[1] = "Monday"
    map[2] = "Tuesday"

    val map2 = mapOf(1 to "First", 2 to "Second")   // 불변 map

    println("${map} ${map2}")

    for(key in map.keys) {
        println("${key} ${map[key]}")
    }

    for((key, value) in map.entries) {
        println("${key} ${value}")
    }
}

