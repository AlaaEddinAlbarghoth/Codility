package codility.lesson10

import kotlin.math.sqrt

/*
* Count factors of given number n.
* */
/**
 * Example: N = 24, Result ==> 8
 * */
fun countFactors(n: Int): Int {

    /* Check from 1 to Sqrt of N */

    // The output
    var factorCounter = 0

    // We take the sqrt to get the near sqrt to n
    val sqrtN = sqrt(n.toFloat()).toInt()
    println("sqrtN = $sqrtN")

    // Check from 1 to Sqrt of N
    for (element in 1..sqrtN)

    // Check if the element is a factor
        if (n % element == 0) {
            factorCounter++
            println("element = $element")
        }
    println("factorCounter = $factorCounter")

    // Add its pair, bcz the requirements takes we need all the factors until, not for the number of sqrt
    factorCounter *= 2
    println("factorCounter *2 = $factorCounter")
    println("sqrtN * sqrtN == n = ${sqrtN * sqrtN == n}")

    // If the number is already a sqrt then we need to minus by one to, bcz we add the pair
    if (sqrtN * sqrtN == n)
        factorCounter--

    return factorCounter
}
