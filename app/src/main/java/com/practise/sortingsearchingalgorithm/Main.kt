package com.practise.sortingsearchingalgorithm

fun main() {

    val linearSearchResult = linearSearch(arrayOf(10, 50, 30, 70, 80, 60, 20, 90, 40), 30)
    if (linearSearchResult == -1) {
        println("Item Not Found")
    } else {
        println("Item Found at position : $linearSearchResult")
    }


    val  binarySearchResult = binarySearch(arrayOf(2, 5, 8, 12, 16, 23, 38, 56, 72, 91), 77)
    if (binarySearchResult == -1) {
        println("Item Not Found")
    } else {
        println("Item Found at position : $binarySearchResult")
    }
}