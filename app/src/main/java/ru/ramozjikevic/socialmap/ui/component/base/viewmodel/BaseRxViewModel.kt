package ru.ramozjikevic.socialmap.ui.component.base.viewmodel


abstract class BaseRxViewModel<T : IViewModelState>(
    initState: T
) : RxViewModel()