package com.example.projecto_1p_77904.models

data class User(val email : String, val password : String){
    companion object{
        val staticUsers = listOf(
            User(email = "hector@correo.com", password = "123456"),
            User(email = "profe@correo.com", password = "123456"),
            User(email = "diego@correo.com", password = "123456"),
            User(email = "samuel@correo.com", password = "123456"),
            User(email = "a", password = "1")
        )
    }
}
