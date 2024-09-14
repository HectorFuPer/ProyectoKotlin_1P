package com.example.projecto_1p_77904.models

data class User(val email : String, val password : String, val name : String){
    companion object{
        val staticUsers = listOf(
            User(email = "hector@correo.com", password = "123456", name = "Hector"),
            User(email = "profe@correo.com", password = "123456", name = "Profe"),
            User(email = "diego@correo.com", password = "123456", name = "Diego"),
            User(email = "samuel@correo.com", password = "123456", name = "Samuel"),
            User(email = "a", password = "1", name = "A")
        )
    }
}
