package com.example.piano_practice_time_ranking

import kotlinx.coroutines.flow.map

class UserRepository(private val userDao: UserDao) {

    fun getUsers() = userDao.getAll()
    fun getNameOfUser() = userDao.getAll().map {
            it -> it.sortedBy { it.nameOfUser }
    }
    fun getToday() = userDao.getAll().map {
            it -> it.sortedBy { it.today }
    }
    fun getHourOfPracticeTime() = userDao.getAll().map {
            it -> it.sortedBy { it.hourOfPracticeTime }
    }
    fun getMinuteOfPracticeTime() = userDao.getAll().map {
            it -> it.sortedBy { it.minuteOfPracticeTime }
    }
}