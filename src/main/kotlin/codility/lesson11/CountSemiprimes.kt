package codility.lesson11

import codility.utils.printArray

/*
* Count the semiprime numbers in the given range [a..b]
* */
fun countSemiprimes(n: Int, p: IntArray, q: IntArray): IntArray {

    // Store the prime numbers btw 1 and n
    val notPrimes = BooleanArray(n + 1) { false } // N = 5, 0,1,2,3,4,5, we need 5, so we make the size = n + 1

    // 1- Make an array of -> not primes
    // We made the stop condition n/2 because the step we are going to do it + 2
    for (a in 2..n / 2) {
        var b = a * 2
        while (b <= n) {
            notPrimes[b] = true
            b += a
        }
    }
    printArray(notPrimes.map { if (it) 1 else 0 }.toIntArray())

    // 2- Make a list of -> primes
    // 2,3,5,7,9,11,13,15,17,19,21,23,25 are primes
    val primes = ArrayList<Int>()
    for (a in 2..n) if (!notPrimes[a]) primes.add(a)

    // -> 3- SemiPrime [4, 6, 9, 10, 14, 15, 21, 22, 25, 26]
    val semiPrimes = IntArray(n + 1)
    for (a in 0 until primes.size) for (b in a until primes.size) {
        val primeA = primes[a]
        val primeB = primes[b]

        if (primeA * primeB > semiPrimes.size) break

        semiPrimes[primeA * primeB] = 1
    }
    printArray(primes.toIntArray())

    // 4- Make the semi primes array contains primes counter for each element in the list
    var c = 0
    for (i in semiPrimes.indices) {
        c += semiPrimes[i]
        semiPrimes[i] = c
    }
    printArray(semiPrimes)

    // Get the result
    val result = IntArray(p.size)
    for (i in p.indices) result[i] = semiPrimes[q[i]] - semiPrimes[p[i] - 1]

    return result
}

