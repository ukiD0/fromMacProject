package com.example.myapplication.common

import android.app.AlertDialog
import android.content.Context

class Helper {

    companion object {

        fun alert(context: Context,title:String, message:String,btnOK: String ="Ok", btnCancel: String ="Cancel"){
            AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(btnOK) {_,_ ->}
                .setNegativeButton(btnCancel) {_,_ ->}
                .show()
        }
    }
}