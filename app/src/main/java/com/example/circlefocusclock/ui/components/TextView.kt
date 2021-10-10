package com.example.circlefocusclock.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.circlefocusclock.R
import com.example.circlefocusclock.ui.theme.CircleFocusClockTheme

@Composable
fun TotalGoalTitle(modifier: Modifier = Modifier) {
    MediumTitle(
        R.string.title_total_goal,
        R.color.gray,
        modifier
    )
}

@Composable
fun TotalGoalMessage(modifier: Modifier = Modifier) {
    MediumMessage(
        R.string.message_total_goal,
        R.color.black,
        arrayOf(4, 30), modifier
    )
}


@Composable
fun MediumTitle(stringId: Int, colorId: Int, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = stringId),
        color = colorResource(id = colorId),
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )
}

@Composable
fun MediumMessage(stringId: Int,
                  colorId: Int,
                  param: Array<Int>,
                  modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = stringId, formatArgs = param),
        color = colorResource(id = colorId),
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier,
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
