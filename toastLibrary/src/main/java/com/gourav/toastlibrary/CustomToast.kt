package com.gourav.toastlibrary

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView


object CustomToast {
    fun showCustomToast(context: Context, s: String, color: Int) {
        val toast = Toast(context)
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.toast_layout, null)

        val msg = view.findViewById<TextView>(R.id.tvMessage)
        val card_view = view.findViewById<CardView>(R.id.card_view)
        card_view.setCardBackgroundColor(context.resources.getColor(color))
        msg.text = s
        toast.view = view
        toast.show()
    }
}