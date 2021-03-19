package edu.itesm.parcialuno

import android.graphics.Picture
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Fighter( val foto:Int ,val nombre:String, val poder:String, val superAtaques: String, val noAtaques: String) : Parcelable