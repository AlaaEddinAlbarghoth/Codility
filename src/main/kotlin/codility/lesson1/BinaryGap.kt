package codility

import kotlin.math.max

/**
 * Examples: MBA(9) = 2, MBA(529) = 4, MBA(20) = 1, MBA(15) = 0, MBA(1) = 0, MBA(1041) = 5,
 * */
/* Find the longest sequence of zeros in binary representation of an integer. */
fun binaryGap(n: Int): Int {
    var number = n
    // # Define the variables we need them here:
    // 1- Max Gaps variable
    var maxGap = 0
    // 2- Current Gaps Counter
    var currentGap = 0
    // 3- Flag to start the counting
    var counting = false

    // # Our logic like the following:
    // 1- Checking if input value is not zero
    while (number != 0) {
        // 2- We need to check if the border is 1 to start counting
        if (!counting) {
            if (number and 1 == 1)
                counting = true
        } else if (number and 1 == 0) { // 3- counting zeros
            currentGap++
        } else { // 4- Set the Max Gap when 1 is found
            maxGap = max(maxGap, currentGap)
            currentGap = 0
        }

        // 5- Shift right to check the left shift
        number = number shr 1
    }

    // 6- Printing the values
    println("The number in bits is ${Integer.toBinaryString(n)}")
    println("Max Gap Count is ======>>> { $maxGap }")

    // 7- Returns the max gap
    return maxGap
}
