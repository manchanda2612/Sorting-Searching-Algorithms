package com.practise.sortingsearchingalgorithm

fun binarySearch(list : Array<Int>, searchedItem : Int) : Int {
    var start = 0
    var end = list.size
    var mid: Int
    val length = list.size / 2
    for(i in 0..length) {
        mid = (start + end) / 2
        if(list[mid] == searchedItem) {
            return mid
        } else if (list[mid] < searchedItem) {
            start = mid + 1
        } else if (list[mid] > searchedItem) {
            end = mid - 1
        }
    }
    return -1
}