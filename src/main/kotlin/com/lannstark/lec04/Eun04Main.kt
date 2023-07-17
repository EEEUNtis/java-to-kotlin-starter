package com.lannstark.lec04

fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = money1
    val money4 = JavaMoney(2_000L)

    if(money1 > money2) {
        println("money1이 money2보다 큽니다.")
    }

    println(money1 == money4)
    println(money1 === money4)
    println(money1 === money3)
}