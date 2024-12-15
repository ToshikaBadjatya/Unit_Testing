package com.example.unit_test.utils


class Helper {
    fun isPalindrome(input: String): Boolean {
        // Clean the input string: remove non-alphanumeric characters and convert to lowercase
        val cleaned = input.filter { it.isLetterOrDigit() }.lowercase()
        // Check if the cleaned string is equal to its reverse
        return cleaned == cleaned.reversed()
    }

}
class Helper2{
    fun reverse(input: String): String {
        // Clean the input string: remove non-alphanumeric characters and convert to lowercase
        val cleaned = input.filter { it.isLetterOrDigit() }.lowercase()
        return cleaned.reversed()
    }
}