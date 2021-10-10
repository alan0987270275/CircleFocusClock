package com.example.circlefocusclock.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.circlefocusclock.R
import com.example.circlefocusclock.ui.theme.CircleFocusClockTheme


@Composable
fun MainPanel() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
            .background(
                Color.White,
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(24.dp)
        ) {
            TotalGoalTitle()
            TotalGoalMessage(modifier = Modifier.padding(bottom = 24.dp))
            GoalButton(R.string.button_text_track_goal, R.color.white)
        }
    }
}

@Composable
fun TaskPanel() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(24.dp)
    ) {
        TotalGoalTitle()
        TotalGoalMessage(modifier = Modifier.padding(bottom = 16.dp))
        GoalButton(R.string.button_text_track_goal, R.color.white)
    }
}

@Preview(showBackground = true)
@Composable
fun PanelPreview() {
    CircleFocusClockTheme {
        MainPanel()
    }
}
