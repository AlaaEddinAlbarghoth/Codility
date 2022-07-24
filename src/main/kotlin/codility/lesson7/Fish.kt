package codility.lesson7

import java.util.Stack


/**
 * Example:
 *  A[0] = 4    B[0] = 0
 *  A[1] = 3    B[1] = 1
 *  A[2] = 2    B[2] = 0
 *  A[3] = 1    B[3] = 0
 *  A[4] = 5    B[4] = 0
 *  ==> Result = 2
 * */
/*
 * N voracious fish are moving along a river. Calculate how many fish are alive.
* */
fun fish(a: IntArray, b: IntArray): Int {

    // The output
    var numAlive = a.size

    // Stack that can holds all downstream fish B[i]==1
    val stack = Stack<Int>()

    // Special case
    if (a.isEmpty())
        return 0

    // Check all fish
    for (i in a.indices) {

        // case 1; for the fish going to downstream
        if (b[i] == 1)
            stack.push(a[i])

        // case 2: for the fish going upstream
        if (b[i] == 0)
            while (stack.isNotEmpty()) {
                when {
                    // Downstream fish is bigger than Upstream fish (eat the upstream fish)
                    stack.peek() > a[i] -> {
                        numAlive-- // the upstream fish is eaten (ending)
                        break
                    }
                    // Upstream fish is bigger than Downstream fish  (eat the downstream fish)
                    stack.peek() < a[i] -> {
                        numAlive--  // the downstream fish is eaten (not ending)
                        stack.pop()
                    }
                }
            }
    }

    return numAlive
}
