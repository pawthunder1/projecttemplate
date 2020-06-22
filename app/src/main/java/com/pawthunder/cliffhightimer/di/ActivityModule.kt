package com.pawthunder.cliffhightimer.di

import com.pawthunder.cliffhightimer.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module(includes = [FragmentsModule::class])
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}
