package com.swhite.dependencyinjectiondemo.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton @Provides
    fun provideApplication(@ApplicationContext app: Context) : BaseApp {
        return app as BaseApp
    }

    @Singleton @Provides
    fun provideRandomString(): String {
        return "Hello World"
    }
}