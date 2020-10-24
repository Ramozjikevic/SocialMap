package ru.ramozjikevic.socialmap.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.ramozjikevic.socialmap.ui.root.RootActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeRootActivity() : RootActivity
}