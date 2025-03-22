package com.benny.fetch_exercise.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.benny.fetch_exercise.data.remote.RetrofitClient
import com.benny.fetch_exercise.domain.models.HiringListItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ListViewModel: ViewModel() {
    private val _data = MutableStateFlow(emptyList<HiringListItem>())
    val data = _data.asStateFlow()

    private suspend fun getData() {
        _data.value = RetrofitClient.hireApi.getHireList().toList()
    }

    init {
        viewModelScope.launch {
            getData()
        }
    }
}