package com.lannstark.lec10

import com.lannstark.lec09.Person

fun main() {

}

class KotlinPerson private constructor(
    var name: String,
    var age: Int
) {

    companion object Factory {
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}