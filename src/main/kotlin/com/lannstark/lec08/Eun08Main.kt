package com.lannstark.lec08

fun main() {
    println(max(2,3))
    repeat("Hello World")

    printAll("A", "B", "C")

    val array = arrayOf("a", "b", "c")
    printAll(*array)
}

fun max(a: Int, b: Int) = if(a > b) a else b

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for(i in 1..num) {
        if(useNewLine) {
            println(str)
        } else {
            println(str)
        }
    }
}

fun printAll(vararg str: String) {
    for(i in str) {
        println(i)
    }
}
