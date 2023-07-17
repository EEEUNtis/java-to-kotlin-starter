package com.lannstark.lec16


fun main() {
    val str = "Eunseo"
    println(str.lastChar())
}

fun String.lastChar(): Char{
    return this[this.length - 1]
}