package com.example.unit_test

import com.example.unit_test.utils.Helper
import junit.framework.TestCase
import org.junit.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedTest(val input:String,val output:Boolean) {
    @Test
    fun check_Palindrome(){
        val result=Helper().isPalindrome(input)
        TestCase.assertEquals(result, output)
    }
    companion object{
        @JvmStatic
        @Parameterized.Parameters(name = "{0}: {1}")
        fun getParams():List<Array<Any>>{
            return listOf(
                arrayOf("level", true),
                arrayOf("nun", true),
                arrayOf("man", false),
                arrayOf("ka", false),
                arrayOf("a", true),
                arrayOf("", true)
            )
        }
    }
}