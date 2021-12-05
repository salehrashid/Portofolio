package com.idnbs.myapplication.data.android

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Android(
    val id: Int = 0,
    var title: String = "",
    var poster: Int = 0,
    var link: String = ""
) : Parcelable
