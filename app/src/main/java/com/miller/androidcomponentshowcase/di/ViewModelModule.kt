package com.miller.androidcomponentshowcase.di

import com.miller.androidcomponentshowcase.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Miller on 13/09/2019
 */

val viewModelModule = module {
    viewModel { HomeViewModel() }
}