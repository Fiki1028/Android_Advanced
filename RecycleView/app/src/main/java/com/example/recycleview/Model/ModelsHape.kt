package com.example.recycleview.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ModelsHape(
    val imgHape: Int,
    val titleIndex: Int,
    val descriptionIndex: Int
) : Parcelable
