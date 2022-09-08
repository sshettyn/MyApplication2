package com.example.myapplication2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Student(val name: String, val rollNo: String):Parcelable
