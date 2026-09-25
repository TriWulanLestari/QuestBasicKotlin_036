package com.example.questbasickotlin_036

//fun main() {
//    println("Hello, world!")
//}

//fun main() {
//
//    val nama = "Budi"
//    var umur = 20
//
//    println(nama)
//    println(umur)
//
//    umur = 21
//
//    println(umur)
//}

//fun main() {
//    // Read only list
//    val readOnlyShapes = listOf("triangle", "square", "circle")
//    println(readOnlyShapes)
//    // [triangle, square, circle]
//
//    // Mutable list with explicit type declaration
//    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
//    println(shapes)
//    // [triangle, square, circle]
//
//    // Read-Only view dari mutable list
//    val shapesLocked: List<String> = shapes
//}

//fun main() {
//    // Read-only map
//    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
//    println(readOnlyJuiceMenu)
//    // {apple=100, kiwi=190, orange=100}
//
//    // Mutable map with explicit type declaration
//    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100).toMutableMap()
//    // Atau versi standar: mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
//    println(juiceMenu)
//    // {apple=100, kiwi=190, orange=100}
//
//    // Read-Only view dari mutable map
//    val juiceMenuLocked: Map<String, Int> = juiceMenu
//
//    // Mengakses nilai map menggunakan operator [] dengan 'key'-nya
//    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
//    // The value of apple juice is: 100
//
//    // Mendapatkan jumlah item dalam Map menggunakan .count()
//    println(readOnlyJuiceMenu.count())
//}

//fun main() {
//    // If expression
//    val check = true
//    val d = if (check) 1 else 2
//    println(d)
//
//    // When expression
//    val obj = "Hello"
//    val result = when (obj) {
//        "1" -> "One"
//        "Hello" -> "Greeting"
//        else -> "Unknown"
//    }
//    println(result)
//}

fun main() {
    // Range & For Loop
    for (number in 1..5) {
        print(number)
    }
    println()

    // While Loop
    var count = 3
    while (count > 0) {
        println("Count down: $count")
        count--
    }
}

