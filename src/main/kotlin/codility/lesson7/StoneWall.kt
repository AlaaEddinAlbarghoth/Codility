package codility.lesson7

import java.util.Stack

/**
 * Example:
 *  H[0] = 8    H[1] = 8    H[2] = 5
 *  H[3] = 7    H[4] = 9    H[5] = 8
 *  H[6] = 7    H[7] = 4    H[8] = 8
 *  Result ==> 7
 * */
/*
* Cover "Manhattan skyline" using the minimum number of rectangles.
* */
fun stoneWall(h: IntArray): Int {

    // The output of the algorithm
    var numOfBlocks = 0

    // A stack to check when we need a new block
    val stack = Stack<Int>()

    // The idea here is like we need to not counting the same heights
    for (i in h.indices) {

        // - When stack is not empty and stack last value is bigger than the new height => Pop()
        while (stack.isNotEmpty() && stack.peek() > h[i]) stack.pop()

        when {
            // - If the stack is empty then push new height the defines a new block, and increment the counter
            stack.isEmpty() -> {
                numOfBlocks++
                stack.push(h[i])
            }
            // - If the new height is lower than stack last element then push the new height and increment the counter
            stack.peek() < h[i] -> {
                numOfBlocks++
                stack.push(h[i])
            }
            stack.peek() == h[i] -> {
                // Do nothing, because it's not a new block, and we need the minimum number of blocks
            }
        }
    }

    return numOfBlocks
}
