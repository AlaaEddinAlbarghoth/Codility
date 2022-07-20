package codility.lesson3

/**
 * Example: A[0] = 2, A[1] = 3, A[2] = 1, A[3] = 5 ==(Result)==> 4
 * */
/* Find the missing element in a given permutation. */
fun missingElement(a: IntArray): Int {

    /* Define the variables  */
    /* lowest index */
    val low = 1
    /* highest index */
    val high = a.size + 1
    /* height of the array */
    val height = a.size + 1

    // The main idea, this calculation will return to us the sum of all number other than the missing number.
    val sum = (high + low) * height / 2

    // assign the sum to the missing number to be calculated later
    var missingNo = sum

    // Subtract all the other values in the array from the sum
    for (i in a.indices)
        missingNo -= a[i]

    // Print the missing number
    println("Missing No is {${missingNo}}")

    // Return the Missing number
    return missingNo
}