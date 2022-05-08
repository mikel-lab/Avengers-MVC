package io.keepcoding.marvel_avengers.Models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


typealias Villains = ArrayList<Villain>

@Parcelize
data class Villain(

    var image: String,
    var name: String,
    var description: String,
    var poderes: String
) : Parcelable