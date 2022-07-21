package codility.lesson5

import codility.utils.printArray
import kotlin.math.min

/**
 * Example:
 * P[0] = 2    Q[0] = 4
 * P[1] = 5    Q[1] = 5
 * P[2] = 0    Q[2] = 6
 *
 * The answers to these M = 3 queries
 * */
/*
* Find the minimal nucleotide from a range of sequence DNA.
* */
/* O^2 */
fun genomicRangeQuerySol1(s: String, p: IntArray, q: IntArray): IntArray {

    val resultArray = IntArray(p.size)

    // Slicing the string into list
    val charArray = s.toCharArray()

    for (index1 in p.indices) {
        val n1 = p[index1]
        val n2 = q[index1]

        var minPos: Int
        var maxPos: Int

        if (n1 < n2) {
            minPos = n1
            maxPos = n2
        } else {
            minPos = n2
            maxPos = n1
        }

        var min = Int.MAX_VALUE
        for (index2 in minPos..maxPos)
            min = min(getImpactFactor(charArray[index2]), min)

        resultArray[index1] = min
    }

    return resultArray
}

fun getImpactFactor(char: Char): Int =
    when (char) {
        'A' -> 1
        'C' -> 2
        'G' -> 3
        'T' -> 4
        else -> -1
    }

/* O */
fun genomicRangeQuerySol2(s: String, p: IntArray, q: IntArray): IntArray {
    val resultArray = IntArray(p.size)

    /* To reduce the complexity we used this way of pre init PreSum */
    /* Define the characters arrays, to put the occurrence and count of each character */
    // DNA characters/(Nucleotides) => [a, c, g, t]
    val a = IntArray(s.length + 1) { 0 }
    val c = IntArray(s.length + 1) { 0 }
    val g = IntArray(s.length + 1) { 0 }
    val t = IntArray(s.length + 1) { 0 }

    // Filling and counting the chars depending on the given string (DNA sequence)
    for (i in s.indices) {
        if (s[i] == 'A') {
            a[i + 1] = a[i] + 1
            c[i + 1] = c[i]
            g[i + 1] = g[i]
            t[i + 1] = t[i]
        } else if (s[i] == 'C') {
            a[i + 1] = a[i]
            c[i + 1] = c[i] + 1
            g[i + 1] = g[i]
            t[i + 1] = t[i]
        } else if (s[i] == 'G') {
            a[i + 1] = a[i]
            c[i + 1] = c[i]
            g[i + 1] = g[i] + 1
            t[i + 1] = t[i]
        } else if (s[i] == 'T') {
            a[i + 1] = a[i]
            c[i + 1] = c[i]
            g[i + 1] = g[i]
            t[i + 1] = t[i] + 1
        }
    }

    // Printing the filled arrays
    println()
    println("-------------------")
    println("A")
    printArray(a)
    println()
    println("-------------------")
    println("C")
    printArray(c)
    println()
    println("-------------------")
    println("G")
    printArray(g)
    println()
    println("-------------------")
    println("T")
    printArray(t)

    // Stop loop condition is the length of queries we want to find is the (minimal impact factor)
    // of nucleotides contained in the DNA sequence between positions P[K] and Q[K] (inclusive)
    // Which is M in this case
    val numOfQuery = p.size
    for (i in 0 until numOfQuery) {
        val av = a[q[i] + 1] - a[p[i]] // Num of a btw P and Q
        val cv = c[q[i] + 1] - c[p[i]] // Num of c btw P and Q
        val gv = g[q[i] + 1] - g[p[i]] // Num of g btw P and Q

        println("a[q[$i] + 1] - a[p[$i]] = ${a[q[i] + 1] - a[p[i]]}, i = $i")
        println("c[q[$i] + 1] - c[p[$i]] = ${c[q[i] + 1] - c[p[i]]}, i = $i")
        println("g[q[$i] + 1] - g[p[$i]] = ${g[q[i] + 1] - g[p[i]]}, i = $i")

        if (av > 0) {// There is a
            resultArray[i] = 1
            println("a = $av")
        } else if (cv > 0) {// There is C
            resultArray[i] = 2
            println("c = $cv")
        } else if (gv > 0) { // There is G
            resultArray[i] = 3
            println("g = $gv")
        } else {// There is T
            resultArray[i] = 4
            println("t")
        }
    }

    return resultArray
}