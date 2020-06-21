package com.pawthunder.projecttemplate.di

import com.pawthunder.projecttemplate.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module(includes = [FragmentsModule::class])
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}
