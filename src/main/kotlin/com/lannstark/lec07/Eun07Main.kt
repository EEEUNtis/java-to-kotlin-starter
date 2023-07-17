package com.lannstark.lec07

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {

    val reader = FileReader()
    //reader.readFile()
    reader.readFileV2("./a.txt")
}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
    }
}

fun parseIntOrNull(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}