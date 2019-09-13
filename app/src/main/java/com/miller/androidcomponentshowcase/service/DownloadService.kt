package com.miller.androidcomponentshowcase.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * Created by Miller on 13/09/2019
 */

class DownloadService : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }
}