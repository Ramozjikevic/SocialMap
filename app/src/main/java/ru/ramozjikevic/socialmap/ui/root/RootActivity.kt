package ru.ramozjikevic.socialmap.ui.root

import dagger.android.AndroidInjector
import ru.ramozjikevic.socialmap.R
import ru.ramozjikevic.socialmap.ui.component.base.BaseActivity
import ru.ramozjikevic.socialmap.ui.component.base.viewModels

class RootActivity : BaseActivity<RootViewModel>() {
    override val layout: Int = R.layout.activity_root
    override val viewModel: RootViewModel by viewModels()
    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector
}