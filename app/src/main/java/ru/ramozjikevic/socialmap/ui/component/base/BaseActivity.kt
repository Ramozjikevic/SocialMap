package ru.ramozjikevic.socialmap.ui.component.base

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import ru.ramozjikevic.socialmap.ui.component.base.viewmodel.BaseRxViewModel
import ru.ramozjikevic.socialmap.ui.component.base.viewmodel.IViewModelState
import javax.inject.Inject

abstract class BaseActivity<T : BaseRxViewModel<out IViewModelState>> : AppCompatActivity(),
    HasAndroidInjector {

    protected abstract val layout: Int
    protected abstract val viewModel: T

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(layout)
    }
}

inline fun <reified T : BaseRxViewModel<out IViewModelState>> BaseActivity<T>.viewModels(
) = viewModels<T> { viewModelFactory }