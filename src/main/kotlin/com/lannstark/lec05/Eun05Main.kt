package com.lannstark.lec05

import java.lang.IllegalArgumentException


fun main() {
    println(getGrade(80))
    println(getGradeWithWhen(91))
    println(startWithA("Apple"))
}
fun validateScoreIsNotNegative(score: Int) {
    if(score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun getGrade(score: Int): String {
    return if(score in 90..100) {
        "A"
    } else if(score in 80..90) {
        "B"
    } else if(score in 70..80) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithWhen(score: Int): String {
    return when(score) {
        in 90..100 -> "A"
        in 80..90 -> "B"
        in 70..80 -> "C"
        else -> "D"
    }
}

fun startWithA(str: String?): Boolean {
    return when(str) {
        is String -> str.startsWith("A")
        else -> false
    }
}