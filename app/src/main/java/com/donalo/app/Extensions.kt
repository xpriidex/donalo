package com.donalo.app

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso


fun Context.toast(message: CharSequence) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

fun ImageView.setImageUrlRounded(url: String?) {
    Picasso
        .get()
        .load(url)
        .fit()
        .centerCrop()
        .into(this)
}



