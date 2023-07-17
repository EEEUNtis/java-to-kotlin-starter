package com.lannstark.lec03

fun main() {

    var num1 : Int? = 3
    val num2 : Long = num1?.toLong() ?: 0

    var person = Person("이은서", 24)
    printAgeIfPerson(null)  // null
    printAgeIfPerson(person)    // 24

    println("이름 : ${person.name}, 나이 : ${person.age} 입니다.")
}

fun printAgeIfPerson(obj: Any?) {
    if(obj is Person) {
        val person = obj as? Person
        println(person?.age) // obj.age 해도 인식가능
    }
}