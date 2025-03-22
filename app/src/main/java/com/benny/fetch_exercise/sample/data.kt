package com.benny.fetch_exercise.sample

import com.benny.fetch_exercise.domain.models.HiringListItem


// Sample data used for the creation of the ListScreen; Kept in for future use,
// so I don't have to make API calls for minor changes
val sampleHireItems: List<HiringListItem> = listOf(
    HiringListItem(
        id = 200,
        listId = 1,
        name = null
    ),
    HiringListItem(
        id = 300,
        listId = 1,
        name = "Test 3"
    ),
    HiringListItem(
        id = 100,
        listId = 1,
        name = "Test"
    ),
    HiringListItem(
        id = 600,
        listId = 2,
        name = "Test 6"
    ),
    HiringListItem(
        id = 700,
        listId = 3,
        name = "Test 7"
    ),
    HiringListItem(
        id = 400,
        listId = 2,
        name = "Test 4"
    ),
    HiringListItem(
        id = 500,
        listId = 2,
        name = null
    ),
)