package codility.lesson6


/**
 *  A[0] = 10    A[1] = 2    A[2] = 5   A[3] = 1     A[4] = 8    A[5] = 20, Result ==>  1
 *  A[0] = 10    A[1] = 50    A[2] = 5    A[3] = 1
 *  returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.
 * */
/*
* Determine whether a triangle can be built from a given set of edges.
* */
fun triangle(a: IntArray): Int {

    // Special Case
    if (a.size < 3)
        return 0

    // Sorting the array, to make it easier to use to look at the next and after the next element if its satisfy the condition
    a.sort()

    // Loop through the array and checking the condition
    for (i in 0 until a.size - 2)
        if (a[i].toLong() + a[i + 1].toLong() > a[i + 2].toLong())
            return 1

    return 0
}
