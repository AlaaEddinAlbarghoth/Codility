package codility.lesson10

/*
* Divide an array into the maximum number of same-sized blocks, each of which should contain an index P such that A[P - 1] < A[P] > A[P + 1].
* */

/**
 * Example = [1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2]
 * */
fun peeks(a: IntArray): Int {

    // We need a list to store all the peaks
    val peaksIndices = ArrayList<Int>()

    // Let's store all the peaks
    for (i in 1 until a.size)
        if (a[i - 1] < a[i] && a[i] > a[i + 1])
            peaksIndices.add(i)

    // Create a var to save the size of A
    val n = a.size

    // Check the factors of N
    for (numOfBlocks in n downTo 1) { // We need the biggest block

        // Find a factor of n
        if (n % numOfBlocks == 0) { // F.e. => 12 % 4 = 0

            // The ith block has a peek
            var ithOfBlocks = 0

            // Create a var to save the size of the block
            val blockSize = n / numOfBlocks // F.e. => 12 / 4 = 3

            for (peakIndex in peaksIndices) // (1, 2, 3, 4), (3, 4, 1, 2), (3, 4, 6, 2), peaksIndices => [3, 5, 10]
                if (peakIndex / blockSize == ithOfBlocks) // F.e. => (3 / 4 = 0) => Result: 1, (5 / 4 = 1) => Result: 2, (10 / 4 = 2) => Result: 3
                    ithOfBlocks++ // Go to check the ith block

            if (ithOfBlocks == numOfBlocks) // F.e. (3 == 3) => Result = true
                return numOfBlocks
        }
    }

    return 0 // If A cannot be divided into some number of blocks, the function should return 0.
}
