package codility.lesson8

/** Example: A= {3,4,3,2,3,-1,3,3}
 * The Result => 5
 * */
/*
* Find an index of an array such that its value occurs at more than half of indices in the array.
* */
fun dominator(a: IntArray): Int {

    // Create a map to save the counters
    val counters = hashMapOf<Int, Int>()

    // Loop over the given list to count each element, Which could be a candidate to be a dominator
    for (i in a.indices) {
        // If the there is a counter update it
        if (counters.containsKey(a[i]))
            counters[a[i]] = counters.getValue(a[i]) + 1
        else
        // If there is no counter create a new one for this element
            counters[a[i]] = 1

        // If the value of the counter is met, then return the index of that element
        if (counters.getValue(a[i]) == (a.size / 2))
            return i
    }

    return -1
}
