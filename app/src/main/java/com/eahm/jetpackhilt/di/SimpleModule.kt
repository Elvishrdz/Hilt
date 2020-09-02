package com.eahm.jetpackhilt.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object SimpleModule {

    @Singleton
    @Provides
    fun provideStringMessage(@ApplicationContext context : Context) : String{
        return "I receive @ApplicationContext as a parameter!"
    }
}