package codility.lesson6

/**
 * Example: A[0] = 2    A[1] = 1    A[2] = 1   A[3] = 2    A[4] = 3    A[5] = 1 ==(Result)==> 3
 * */
/* Compute number of distinct values in an array. */
fun distinct(a: IntArray): Int {

    // Define the result value, and for the initial setting that the condition in for loop can't handle it we have to set it to 1
    var result = 1

    // Special case
    if (a.isEmpty()) return 0

    // Sort the array
    a.sort()

    for (i in 0 until a.size - 1)
        if (a[i] != a[i + 1]) result++

    // print the value
    println("The result is :$result")

    return result
}
