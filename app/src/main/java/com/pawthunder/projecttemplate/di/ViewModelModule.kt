package com.pawthunder.projecttemplate.di

import androidx.lifecycle.ViewModelProvider
import com.pawthunder.projecttemplate.util.ViewModelFactory
import dagger.Binds
import dagger.Module

@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    // FIXME: Here goes view models
    /*@Binds
    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    abstract fun bindTimerViewModel(ratesModel: ExampleViewModel): ViewModel*/
}
