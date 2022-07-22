package codility.lesson6

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
