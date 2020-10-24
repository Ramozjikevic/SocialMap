package ru.ramozjikevic.socialmap.di.module.scheduler

import io.reactivex.Scheduler


interface SchedulersProvider {
    fun io(): Scheduler
    fun main(): Scheduler
    fun computation(): Scheduler
}