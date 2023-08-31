package com.mati.wikiapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MailData(

     val title: String,
     val sub_text: String,
     val text: String,
     val time: String,
     val star: Boolean

): Parcelable