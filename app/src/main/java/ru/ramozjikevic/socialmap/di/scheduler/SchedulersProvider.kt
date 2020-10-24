package ru.ramozjikevic.socialmap.di.scheduler

import io.reactivex.Scheduler


interface SchedulersProvider {
    fun io(): Scheduler
    fun main(): Scheduler
    fun computation(): Scheduler
}