package com.miller.androidcomponentshowcase.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.miller.androidcomponentshowcase.R

/**
 * Created by Miller on 13/09/2019
 */

fun AppCompatActivity.addFragment(
    fragment: Fragment,
    containerId: Int? = null,
    addToBackStack: Boolean? = false,
    tag: String? = null
) {
    supportFragmentManager.beginTransaction().apply {
        add(containerId ?: R.id.container, fragment, tag)
        if (addToBackStack == true) addToBackStack(tag)
    }
}