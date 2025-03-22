package com.benny.fetch_exercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.benny.fetch_exercise.sample.sampleHireItems
import com.benny.fetch_exercise.ui.ListScreen
import com.benny.fetch_exercise.ui.ListScreen2
import com.benny.fetch_exercise.ui.ListViewModel
import com.benny.fetch_exercise.ui.theme.Fetch_ExerciseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Fetch_ExerciseTheme {
                ListScreen2(
                    listViewModel = ListViewModel()
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListScreenPreview() {
    ListScreen(
        hireItems = sampleHireItems
    )
}