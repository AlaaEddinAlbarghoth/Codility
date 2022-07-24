package codility.lesson7

import java.util.*

/**
 * Example: "{[()()]}" => Result => 1
 * */
/*
* Determine whether a given string of parentheses (multiple types) is properly nested.
* */
fun brackets(s: String): Int {

    // Special cases
    when {
        s.isEmpty() -> return 1
    }

    // Create a stack to store all chars
    val stack = Stack<Char>()

    // Push chars into the stack
    for (i in s.indices) {
        when {
            s[i] == '(' -> stack.push(')') // Push the corresponding char to check it later
            s[i] == '[' -> stack.push(']') // Push the corresponding char to check it later
            s[i] == '{' -> stack.push('}') // Push the corresponding char to check it later
            s[i] == ')' || s[i] == ']' || s[i] == '}' -> {
                if (stack.isEmpty())
                    return 0
                else
                    stack.pop().let { char ->
                        if (char != s[i])
                            return 0
                    }
            }
        }
    }

    // Check if stack is empty
    return if (stack.isEmpty())
        1
    else
        0
}
