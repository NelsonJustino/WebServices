package com.example.logonrmlocal.webservices.api

import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService{

    @GET("/users/{username}")
    fun buscaUsuario(@Path("usermame") username:String)

}