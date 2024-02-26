
package com.example.myapplication.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.R
import com.example.myapplication.model.DbConnection
import com.example.myapplication.model.Transaction
import io.github.jan.supabase.postgrest.from


class TransactionViewModelFragment : ViewModel() {

    private  var _transactionS: MutableLiveData<List<Transaction>> = MutableLiveData()
    val tranS: LiveData<List<Transaction>> = _transactionS

    private var _transaction: MutableLiveData<Transaction> = MutableLiveData()
    val trans: LiveData<Transaction> = _transaction

    suspend fun getAllTrans(user_id: String){
        _transactionS.value = DbConnection.supabase.from("trans").select {
            filter {
                Transaction:: user_id eq user_id
            }
        }.decodeList()
    }
}