package com.example.unit_test

import com.example.unit_test.utils.Helper
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test


class HelperTest {
    lateinit var helper: Helper
    @Before
    fun before(){
        helper=Helper()
        println("before test")
    }
    @After
    fun after(){
     println("after test")
    }
    @Test
    fun check_Palindrome_input_hello_output_false(){
        val outPut=helper.isPalindrome("hello")
       assertEquals(outPut,false)
    }
    @Test
    fun check_Palindrome_input_level_output_true(){
        val outPut=helper.isPalindrome("level")
        assertEquals(outPut,true)

    }

}