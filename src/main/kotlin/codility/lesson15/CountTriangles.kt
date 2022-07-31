package codility.lesson15

/*
* Count the number of triangles that can be built from a given set of edges.
* */
/**
 * Example: [10, 2, 5, 1, 8, 12]
 * A[0] = 10    A[1] = 2    A[2] = 5
 * A[3] = 1     A[4] = 8    A[5] = 12
 * Result = 4
 * */
fun countTriangles(a: IntArray): Int {
    var numTriangle = 0

    // important: sort the edges
    // so that we just need to check if
    // "1st edge + 2nd edge > 3rd edge"
    a.sort()

    // Using "Caterpillar method"
    // so we can have O(n^2), not O(n^3)
    for (i in 0 until a.size - 2) {

        // the leftEnd and rightEnd of the "Caterpillar"
        var leftEnd = i + 1
        var rightEnd = i + 2

        while (leftEnd < a.size - 1) {
            // key point of "Caterpillar method"
            if (rightEnd < a.size && a[i] + a[leftEnd] > a[rightEnd])
                rightEnd++
            else {
                // note: need to minus "1"
                // because the rightEnd is not included
                numTriangle += (rightEnd - leftEnd - 1)
                leftEnd++ // decrease the Caterpillar
            }
        }
    }

    return numTriangle
}
