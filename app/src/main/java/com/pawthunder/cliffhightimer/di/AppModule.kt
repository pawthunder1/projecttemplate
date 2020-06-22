package com.pawthunder.cliffhightimer.di

import dagger.Module

@Module(includes = [ViewModelModule::class])
class AppModule {

    // FIXME: Delete or redo if unnecessary
    /*@Singleton
    @Provides
    fun provideAppDatabase(app: Application): AppDatabase =
        Room.databaseBuilder(app, AppDatabase::class.java, PawthunderApp.DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()*/

}
