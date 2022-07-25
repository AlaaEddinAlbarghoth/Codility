package codility.lesson9

import kotlin.math.max

/*
* Given a log of stock prices compute the maximum possible earning.
* */
/**
 * Example: A[0] = 23171 A[1] = 21011 A[2] = 21123 A[3] = 21366 A[4] = 21013 A[5] = 21367, Result ===> 356
 * */
fun maxProfit(a: IntArray): Int {

    // Get the price at the first index to compare it with other days prices in the array
    var minPrice = a[0]
    var maxProfit = 0

    // Loop over the array to get the min price, and calculate the max profit
    for (i in a.indices)
        if (a[i] < minPrice) // Get the min price
            minPrice = a[i]
        else// Get the max profit
            maxProfit = max(a[i] - minPrice, maxProfit)

    return maxProfit
}
