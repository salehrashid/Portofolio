package com.idnbs.myapplication.ui.experience

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load
import com.idnbs.myapplication.data.experience.Experience

@BindingAdapter("experienceTitle")
fun TextView.setExperienceTitle(data: Experience?){
    data?.let {
        text = data.title
    }
}

@BindingAdapter("experienceDetail")
fun TextView.setExperienceDetail(data: Experience?){
    data?.let {
        text = data.detail
    }
}

@BindingAdapter("experienceImage")
fun ImageView.setExperienceImage(data: Experience){
    load(data.image){
        crossfade(1000)
    }
}