package com.gourav.toastlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_show: Button = findViewById(R.id.btn_show)

        btn_show.setOnClickListener {
            CustomToast.showCustomToast(this, "hello custom toast", R.color.black)
        }

    }
}