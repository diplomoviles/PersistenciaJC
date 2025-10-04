package com.amaurypm.persistenciajc.sp

import android.content.Context
import android.content.SharedPreferences
import androidx.annotation.ColorRes
import androidx.core.content.edit
import com.amaurypm.persistenciajc.Constants
import com.amaurypm.persistenciajc.R

object SpHelper {

    private lateinit var sp: SharedPreferences

    fun init(context: Context){
        if(!::sp.isInitialized){
            sp = context.getSharedPreferences(Constants.SP_FILE, Context.MODE_PRIVATE)
        }
    }

    fun readBgColor(): Int =
        sp.getInt(Constants.BG_COLOR, R.color.white)

    fun writeBgColor(@ColorRes color: Int){
        sp.edit {
            putInt(Constants.BG_COLOR, color)
        }
    }

}