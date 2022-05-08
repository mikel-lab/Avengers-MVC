package io.keepcoding.marvel_avengers.Models

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


typealias Heroes = ArrayList<Heroe>

@Parcelize
data class Heroe(

    var image: String,
    var name: String,
    var description: String,
    var poderes: String
) : Parcelable
