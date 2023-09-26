package com.example.projectbpxxxx

class Login {
    var username = ""
    var password = ""

    fun loginCheck():Boolean{
        if(username.equals("stevi")&&password.equals("amikom")){
            return true
        }else{
            return false
        }
    }
}

