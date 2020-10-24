package ru.ramozjikevic.socialmap.di.module.scheduler

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class SchedulersModule {

    @Binds
    @Singleton
    abstract fun provideSchedulers(schedulersProvider: SchedulersProviderImpl): SchedulersProvider
}