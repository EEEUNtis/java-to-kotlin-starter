package com.lannstark.lec17

fun main() {

    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("바나나", 1_500),
        Fruit("바나나", 2_000),
        Fruit("바나나", 3_000),
        Fruit("바나나", 1_000),
        Fruit("수박", 1_000),
        Fruit("수박", 2_000)
    )
    
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2 = {fruit: Fruit -> fruit.name == "사과"}

    println(isApple(fruits[0]))
    println(isApple2(fruits[0]))

    println(filterFruit(fruits, isApple2))
}

private fun filterFruit(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for(fruit in fruits) {
        if(filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}