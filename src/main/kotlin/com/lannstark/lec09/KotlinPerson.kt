package com.lannstark.lec09

import java.lang.IllegalArgumentException

fun main() {

    val person = Person("이은서", 24)
    println(person.name)
    person.age = 22
    println(person.age)

    val person2 = Person("EEEUN")
    println("${person2.name} ${person2.age}" )

}
class Person(
    val name: String = "이은서",   // 부생성자 대신 이렇게 디폴트 파라미터값을 넣어주는걸 권장
    var age: Int = 13
) {
    init {
        if(age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    constructor(name: String) : this(name, 1) {
        println("부생성자")
    }

    fun getUppercaseName(): String {
        return this.name.uppercase()
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    // custom getter
    val isAdultV2: Boolean
        get() = this.age >= 20
}