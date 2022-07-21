package codility.lesson5

import kotlin.math.floor

/**
 * Example: A = 6, B = 11 and K = 2 ==(Result)==> 3
 * */
/*
* Compute number of integers divisible by k in range [a..b].
* */
fun countDiv(a: Int, b: Int, k: Int): Int {

    // Getting the divisible number for a
    val numA = floor((a / k).toDouble()).toInt()
    // Getting the divisible number for b
    val numb = floor((b / k).toDouble()).toInt()

    // Subtract (b-a) to get the in range number
    val numDiv = numb - numA

    // We just get in range number, but we need to check if (a) also is divisible by (k)
    return if (a % k == 0)
        numDiv + 1
    else
        numDiv
}