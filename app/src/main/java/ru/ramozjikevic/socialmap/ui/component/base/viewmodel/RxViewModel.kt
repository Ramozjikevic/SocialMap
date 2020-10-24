package ru.ramozjikevic.socialmap.ui.component.base.viewmodel

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import ru.ramozjikevic.socialmap.di.module.scheduler.SchedulersProvider

abstract class RxViewModel : ViewModel() {

    protected abstract val schedulers: SchedulersProvider
    protected val disposes = CompositeDisposable()

    private fun Disposable.bind() = disposes.add(this)

    override fun onCleared() {
        super.onCleared()
        disposes.dispose()
    }
}