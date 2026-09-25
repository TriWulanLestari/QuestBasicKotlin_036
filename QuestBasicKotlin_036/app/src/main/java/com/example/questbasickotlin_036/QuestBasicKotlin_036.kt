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

fun main() {
    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    // [triangle, square, circle]

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    // [triangle, square, circle]

    // Read-Only view dari mutable list
    val shapesLocked: List<String> = shapes
}