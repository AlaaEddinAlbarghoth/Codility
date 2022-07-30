package codility.lesson15

import kotlin.math.abs

/*
* Compute number of distinct absolute values of sorted array elements.
* */

/**
 * Example: -5,-3,-1,0,3,6
 * */
fun absDistinct(a: IntArray): Int {

    val list = arrayListOf<Int>()

    for (element in a)
        if (!list.contains(abs(element)))
            list.add(element)
    
    return list.size
}
