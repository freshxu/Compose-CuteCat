package com.example.androiddevchallenge.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Cat(
    @DrawableRes val imageId: Int,
    val title: String,
    val desc: String
) : Parcelable