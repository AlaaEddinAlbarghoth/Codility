package codility.lesson10

import kotlin.math.min

/*
* Find the minimal perimeter of any rectangle whose area equals N.
* */

/**
 * Example:  N = 30, Result ==> 22
 * */
fun minPerimeterRectangle(n: Int): Int {

    // The output of the Algorithm
    var minimalPerimeter = Int.MAX_VALUE

    // Walk over all the numbers between 1 until N
    for (element in 1..n)
        if (n % element == 0) // If current element is the factor, calculate the perimeter and save check if its value is the minimum until now
            minimalPerimeter = min((n / element + element) * 2, minimalPerimeter)

    return minimalPerimeter
}
