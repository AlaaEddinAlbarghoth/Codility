package codility.lesson4

/**
 *  A[0] = 4, A[1] = 1, A[2] = 3, A[3] = 2  ==(Result)==> 1
 * */
/* Check whether array A is a permutation. */
fun permCheck(a: IntArray): Int {
    val list = arrayListOf<Int>()

    for (i in a.indices)
        list.add(a[i])

    for (i in 1 until a.size) {
        if (!list.contains(i)) {
            // Print the result
            println("The Result is 0")
            return 0
        }
    }

    // Print the result
    println("The Result is 1")

    return 1
}
