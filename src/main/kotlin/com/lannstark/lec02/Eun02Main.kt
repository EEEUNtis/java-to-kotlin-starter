package com.lannstark.lec02

import java.lang.IllegalArgumentException


    fun main() {

        println("${startWithA1("Apple")} " +
                "${startWithA2(null)} " +
                "${startWithA3(null)} " +
                "${startWith("AAA")}")

    }

    fun startWithA1(str: String?): Boolean {
        return str?.startsWith("A") ?: throw IllegalArgumentException("null입니다")

/*        if(str == null) {
            throw IllegalArgumentException("null")
        }
        return str.startsWith("A")*/
    }

    fun startWithA2(str: String?): Boolean? {
        return str?.startsWith("A")

/*        if(str == null) {
           return null;
        }
        return str.startsWith("A")*/
    }

    fun startWithA3(str: String?): Boolean {
        return str?.startsWith("A") ?: false

/*        if(str == null) {
            return false
        }
        return str.startsWith("A")*/
    }

    fun startWith(str: String?): Boolean {
        return str!!.startsWith("A")    // !!. 절대 null이 아님
    }
