package com.amaurypm.persistenciajc.application

import android.app.Application
import com.amaurypm.persistenciajc.sp.SpHelper

class PersistenciaJCApp: Application() {
    override fun onCreate() {
        super.onCreate()
        SpHelper.init(this)
    }
}