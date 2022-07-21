package codility.lesson5

/**
 * Example: A[0] = 0, A[1] = 1, A[2] = 0, A[3] = 1, A[4] = 1 ==(Result)==> 5
 * */
/*
* Count the number of passing cars on the road.
* */
fun passingCars(a: IntArray): Int {
    // Pairs counter
    var numEast = 0
    var numPass = 0

    // List the contains all the elements
    a.forEach { element ->
        if (element == 0) // To east
            numEast++
        else if (element == 1) // To west
            numPass += numEast
    }

    return if (numPass > 1000_000_000)
        -1
    else
        numPass
}
