package codility.lesson17

import kotlin.math.max

/*
* In a given array, find the subset of maximal sum in which the distance between consecutive elements is at most 6.
* */
/**
 * Example: [1, -2, 0, 9, -1, -2] Result => 8
 * */
fun numberSolitaire(a: IntArray): Int {
    // 1- a.size = N consecutive squares, (0, n - 1)
    // 2- squares can be marked during the game
    // 3- At the beginning of the game, there is a pebble on square number 0 and this is the only square on the board which is marked.
    // 4- During each turn we throw a six-sided die, with numbers from 1 to 6 on its faces
    // 5- consider the number K, which shows on the upper face after the die comes to rest. Then we move the pebble standing on square number I to square number I + K
    // 6-  providing that square number I + K exists. If square number I + K does not exist, we throw the die again until we obtain a valid move. Finally, we mark square number I + K.
    // 7- The result = The marked squares are 0, 3 and 5, so the result of the game is 1 + 9 + (−2) = 8.

    // main idea:
    // using "dynamic programming" to build up the solution (bottom up)

    val dp = IntArray(a.size)
    dp[0] = a[0]

    // build up from "dp[1], dp[2], ..., dp[A.length-1]"
    for (i in 1 until a.size) {
        // keep the biggest one, be very careful: could be negative (so use Integer.MIN_VALUE)
        var max = Int.MIN_VALUE

        // dynamic programming:
        // take the best:
        // takeBest( dp[i-j] + value[j], curBest )
        // =======================================
        // very important: not "A[i-die]+A[i]"
        // instead, have to use "dp[i-die]+A[i]"
        for (die in 1 until 6)
            if (i - die >= 0)
                max = max(dp[i - die] + a[i], max)

        dp[i] = max  // keep the best one as the dp value
    }

    return dp[a.size - 1]
}

//        println("----------------")
//                println("***")
//                println("i = $i")
//                println("die = $die")
//                println("i - die = ${(i - die)}")
//                println("a[i] = " + a[i])
//                println("dp[i - die] = " + dp[i - die])
//                println("max = $max")