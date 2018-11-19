package com.example.root.busscheck

class User{


    data class Users(val data: ArrayList<User>)

    data class User(
            val login: String,
            val nome: String,
            val sobrenome: String,
            val matricula: String,
            val email: String,
            val password: String,
            val tipodeusuario: String,
            val token: String)

    data class Schedule(
            val data: String,
            val presenca: String,
            val embarque: String,
            val turno: String,
            val diasemana: String)

}


