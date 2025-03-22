package com.benny.fetch_exercise.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import com.benny.fetch_exercise.domain.models.HiringListItem
import com.benny.fetch_exercise.ui.components.ListCard

@Composable
fun ListScreen(hireItems: List<HiringListItem>) {
    val hireLists = hireItems
        .filterNot { it.name.isNullOrEmpty() }
        .sortedWith(compareBy({ it.listId },{it.name}))
        .groupBy { it.listId }
        .values
        .toList()

    Text(hireLists[0].toString())
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            items(hireLists.size) { i->
                ListCard(hireLists, i)
            }
        }
    }
}

@Composable
fun ListScreen2(listViewModel: ListViewModel) {
    val hireItems = listViewModel.data.collectAsState().value

    val hireLists = hireItems
        .filterNot { it.name.isNullOrEmpty() }
        .sortedWith(compareBy({ it.listId },{it.name}))
        .groupBy { it.listId }
        .values
        .toList()

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            items(hireLists.size) { i->
                ListCard(hireLists, i)
            }
        }
    }
}