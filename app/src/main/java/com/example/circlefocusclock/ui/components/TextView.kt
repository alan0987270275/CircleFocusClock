package com.example.circlefocusclock.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.circlefocusclock.R
import com.example.circlefocusclock.ui.theme.CircleFocusClockTheme

@Composable
fun TotalGoalTitle() {
    MediumTitle(R.string.title_total_goal, R.color.gray)
}

@Composable
fun TotalGoalMessage() {
    MediumMessage(R.string.message_total_goal, R.color.black, arrayOf(4, 30))
}


@Composable
fun MediumTitle(stringId: Int, colorId: Int) {
    Text(
        text = stringResource(id = stringId),
        color = colorResource(id = colorId),
        fontSize = 24.sp
    )
}

@Composable
fun MediumMessage(stringId: Int, colorId: Int, param: Array<Int>) {
    Text(
        text = stringResource(id = stringId, formatArgs = param),
        color = colorResource(id = colorId),
        fontSize = 36.sp
    )
}

@Preview(showBackground = true)
@Composable
fun TextViewPreview() {
    CircleFocusClockTheme {
        Column {
            TotalGoalTitle()
            TotalGoalMessage()
        }
    }
}
