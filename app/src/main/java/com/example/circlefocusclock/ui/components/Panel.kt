package com.example.circlefocusclock.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.circlefocusclock.ui.theme.CircleFocusClockTheme


@Composable
fun MainPanel() {
    Column {
        TotalGoalTitle()
        TotalGoalMessage()
    }
}

@Composable
fun TaskPanel() {

}

@Preview(showBackground = true)
@Composable
fun PanelPreview() {
    CircleFocusClockTheme {
        MainPanel()
    }
}
