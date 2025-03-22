package com.benny.fetch_exercise.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.benny.fetch_exercise.domain.models.HiringListItem

@Composable
fun ListCard(hireLists: List<List<HiringListItem>>, i: Int) {
    Card(
        elevation = CardDefaults.cardElevation(2.dp),
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Row(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Column {
                Text(
                    "ListId: " + hireLists[i][0].listId.toString(),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                HorizontalDivider()
                Column {
                    for (j in hireLists[i]) {
                        Text(
                            j.name.toString(),
                            fontSize = 12.sp,
                        )
                    }
                }
            }
        }
    }
}