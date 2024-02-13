package com.practise.sortingsearchingalgorithm

fun linearSearch(list : Array<Int>, searchItem : Int) : Int {

    for(i in list.indices) {
        if(list[i] == searchItem) {
            return i
        }
    }
    return -1
}