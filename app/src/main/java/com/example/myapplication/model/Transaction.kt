package com.example.myapplication.model

import kotlinx.serialization.Serializable

@Serializable
data class Transaction(
    var id: Int,
    var date: String,
    var money: Float,
    var name_trans: String,
    var description: String,
    var user_id: String
)