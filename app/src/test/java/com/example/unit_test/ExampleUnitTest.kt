package com.example.unit_test

import com.example.unit_test.utils.Helper
import com.example.unit_test.utils.Helper2
import com.example.unit_test.utils.PasswordValidator
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(value = Parameterized::class)
class ValidatorTest(val input:String,val output:Boolean) {
    lateinit var passwordValidator: PasswordValidator
    @Before
    fun before(){
        passwordValidator= PasswordValidator()
    }
    @Test
    fun checkValidTest() {
        assertEquals(passwordValidator.validate(input), output)
    }

    companion object{
        @JvmStatic
        @Parameterized.Parameters(name = "{0}: {1}")
        fun getParams()= listOf(
            arrayOf("",false),
            arrayOf("abder",false),
            arrayOf("qwertyuioplkjhgfdz",false),
            arrayOf("asdfghjklo",true),
            arrayOf("asdfgh",true),
        )
    }
}
@RunWith(value = Parameterized::class)
class ReverseTest(val input:String,val output:String) {
    lateinit var helper: Helper2
    @Before
    fun before(){
        helper= Helper2()
    }
    @Test
    fun checkValidTest() {
        assertEquals(helper.reverse(input), output)
    }

    companion object{
        @JvmStatic
        @Parameterized.Parameters(name = "{0}: {1}")
        fun getParams()= listOf(
            arrayOf("",""),
            arrayOf("abc","cba"),
            arrayOf("a","a"),
            arrayOf("aabbcc","ccbbaa"),
        )
    }
}