package ru.ramozjikevic.socialmap.ui.component.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.android.support.AndroidSupportInjection
import ru.ramozjikevic.socialmap.di.module.viewmodel.ViewModelFactory
import ru.ramozjikevic.socialmap.ui.component.base.viewmodel.BaseRxViewModel
import ru.ramozjikevic.socialmap.ui.component.base.viewmodel.IViewModelState
import javax.inject.Inject

abstract class BaseFragment<T : BaseRxViewModel<out IViewModelState>> : Fragment() {
    protected abstract val layout: Int
    protected abstract val viewModel: T

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }
}

inline fun <reified T : BaseRxViewModel<out IViewModelState>> BaseFragment<T>.viewModels(
) = viewModels<T> { viewModelFactory }