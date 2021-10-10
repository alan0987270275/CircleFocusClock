package com.example.circlefocusclock.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.circlefocusclock.R
import com.example.circlefocusclock.ui.theme.Blue200
import com.example.circlefocusclock.ui.theme.CircleFocusClockTheme

@Composable
fun GoalButton(stringId: Int, Color: Int) {
    NormalButton(stringResource(stringId), Color)
}

@Composable
fun NormalButton(message: String, color: Int) {
    Button(
        onClick = { /* ... */ },
        // Uses ButtonDefaults.ContentPadding by default
        contentPadding = PaddingValues(
            start = 12.dp,
            top = 12.dp,
            end = 12.dp,
            bottom = 12.dp
        ),
        colors = ButtonDefaults.buttonColors(backgroundColor = Blue200)
    ) {
        Text(
            text = message,
            color = colorResource(id = color)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonPreview() {
    CircleFocusClockTheme {
        Column {
            GoalButton(R.string.button_text_track_goal, R.color.white)
        }
    }
}

