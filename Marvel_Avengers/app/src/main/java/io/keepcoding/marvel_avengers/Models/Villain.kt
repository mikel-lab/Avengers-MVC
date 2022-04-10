package io.keepcoding.marvel_avengers.Models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


typealias Villains = ArrayList<Villain>

@Parcelize
data class Villain(

    var name: String,
    var image: String,
    var description: String,
    var poderes: String
) : Parcelable