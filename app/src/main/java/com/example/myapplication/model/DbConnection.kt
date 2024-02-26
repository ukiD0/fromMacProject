package com.example.myapplication.model

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.Auth
import io.github.jan.supabase.postgrest.Postgrest

class DbConnection {

    companion object{

        val supabase = createSupabaseClient(
            supabaseUrl = "https://dczfovliwangyliweyzu.supabase.co",
            supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImRjemZvdmxpd2FuZ3lsaXdleXp1Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3MDY1NDg1MDcsImV4cCI6MjAyMjEyNDUwN30.Zor-ZnTqyhro213PXUCmPzXp1xobFXf7FEXLgMSJbK8"
        ){
            install(Auth)
            install(Postgrest)
        }
    }

}