package codility.lesson3

/**
 * Example: A[0] = 2, A[1] = 3, A[2] = 1, A[3] = 5 ==(Result)==> 4
 * */
/* Find the missing element in a given permutation. */
fun missingElement(a: IntArray): Int {

    val low = 1
    val high = a.size + 1
    val height = a.size + 1

    val sum = (high + low) * height / 2
    var missingNo = sum

    for (i in a.indices)
        missingNo -= a[i]

    println("Missing No is {${missingNo}}")

    return missingNo
}