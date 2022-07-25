package codility.lesson8

/** Example = {4,3,4,4,4,2} */
/* Find the index S such that the leaders of the sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N - 1] are the same. */
fun equiLeader(a: IntArray): Int {

    // Create a map to save the counters, we need to get the equiLeader value that occurs S times in the array.
    val counters = hashMapOf<Int, Int>()

    // We need to tmp save Dominator, and its count to check the sequences depending on these values
    var dominator = 0
    var dominatorCount = 0

    // The output of the algorithm
    var equiLeaderCounter = 0

    // We need both dominator and dominator counter, so we can get the number of accurence of dominators

    // Loop over the given list to count each element, Which could be a candidate to be a dominator
    for (i in a.indices) {
        // If the there is a counter update it
        if (counters.containsKey(a[i]))
            counters[a[i]] = counters.getValue(a[i]) + 1
        else
        // If there is no counter create a new one for this element
            counters[a[i]] = 1

        // If the value of the counter is greater than the condition
        if (counters.getValue(a[i]) > (a.size / 2)) {
            dominator = a[i]
            dominatorCount = counters.getValue(a[i])
        }
    }

    // Depending on dominatorCount we can check the left and right elements

    var countLeftSide = 0
    var countRightSide = a.size
    var leadersInLeftSide = 0
    var leadersInRightSide = dominatorCount

    for (i in a.indices) {

        // Do the counting in case this element is dominator
        if (a[i] == dominator) {
            leadersInLeftSide++
            leadersInRightSide--
        }

        countLeftSide++
        countRightSide--

        if (leadersInLeftSide > countLeftSide / 2)
            if (leadersInRightSide > countRightSide / 2)
                equiLeaderCounter++
    }

    return equiLeaderCounter
}
