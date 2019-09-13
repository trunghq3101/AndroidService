package com.miller.androidcomponentshowcase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.miller.androidcomponentshowcase.ui.home.HomeFragment
import com.miller.androidcomponentshowcase.utils.addFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(HomeFragment.newInstance())
    }
}
