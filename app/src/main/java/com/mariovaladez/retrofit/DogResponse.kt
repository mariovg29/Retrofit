package com.mariovaladez.retrofit

import android.hardware.biometrics.BiometricManager
import com.google.gson.annotations.SerializedName

data class DogResponse (
    @SerializedName("status")   var status:String,
    @SerializedName("message")  var imagenes: List<String>

        )