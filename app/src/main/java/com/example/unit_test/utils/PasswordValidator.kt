package com.example.unit_test.utils

class PasswordValidator {
    fun validate(password:String):Boolean{
        return if(password.isEmpty()){
            false
        } else !(password.length<6||password.length>15)

    }
}