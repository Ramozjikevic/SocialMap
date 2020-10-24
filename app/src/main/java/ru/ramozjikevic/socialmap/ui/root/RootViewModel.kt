package ru.ramozjikevic.socialmap.ui.root

import ru.ramozjikevic.socialmap.di.module.scheduler.SchedulersProvider
import ru.ramozjikevic.socialmap.ui.component.base.viewmodel.BaseRxViewModel
import ru.ramozjikevic.socialmap.ui.component.base.viewmodel.IViewModelState
import javax.inject.Inject

class RootViewModel @Inject constructor(
    override val schedulers: SchedulersProvider
) : BaseRxViewModel<RootState>(RootState())

class RootState : IViewModelState