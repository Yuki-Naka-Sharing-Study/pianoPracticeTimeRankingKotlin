package com.example.piano_practice_time_ranking

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData

class UserViewModel(
    private val repo: UserRepository
): ViewModel() {
    val users: LiveData<List<UserEntity>>
            = repo.getUsers().asLiveData()
    val nameOfUser: LiveData<List<UserEntity>>
            = repo.getNameOfUser().asLiveData()
    val today: LiveData<List<UserEntity>>
            = repo.getToday().asLiveData()
    val hourOfPracticeTime: LiveData<List<UserEntity>>
            = repo.getHourOfPracticeTime().asLiveData()
    val minuteOfPracticeTime: LiveData<List<UserEntity>>
            = repo.getMinuteOfPracticeTime().asLiveData()
}