package ru.ramozjikevic.socialmap.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import ru.ramozjikevic.socialmap.App
import ru.ramozjikevic.socialmap.di.module.viewmodel.ViewModelModule
import javax.inject.Singleton

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ViewModelModule::class
    ]
)
@Singleton
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(app: App)
}