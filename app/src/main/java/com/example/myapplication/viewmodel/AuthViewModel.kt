package com.example.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.model.DbConnection
import io.github.jan.supabase.gotrue.auth
import io.github.jan.supabase.gotrue.providers.builtin.Email
import io.github.jan.supabase.gotrue.user.UserInfo

class AuthViewModel {

    private var _user: MutableLiveData<UserInfo> = MutableLiveData()
    val user: LiveData<UserInfo> = _user

    suspend fun auth(out_email:String,out_password:String){
        DbConnection.supabase.auth.signInWith(Email){
            email = out_email
            password = out_password
        }
    }

    suspend fun registration(out_email: String,out_password: String){
        DbConnection.supabase.auth.signUpWith(Email){
            email = out_email
            password = out_password
        }
    }

    suspend fun logOut(){
        DbConnection.supabase.auth.signOut()
    }



}