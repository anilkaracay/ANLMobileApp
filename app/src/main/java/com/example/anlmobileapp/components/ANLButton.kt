package com.example.anlmobileapp.components


import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import com.example.anlmobileapp.enums.ButtonTypes

@Composable

fun ANLButton(
  onClick: () -> Unit,
  text: String,
  modifier: Modifier = Modifier,
  isEnable: Boolean= true,
  type: ButtonTypes,
  shape: Shape
) {
  Button(
    onClick = onClick,
    modifier = modifier,
    enabled = isEnable,
    shape = shape,
    colors = themeGenerator(
      type = type
    ),

  ) {
    Text(text = text)

  }
}

@Composable
fun themeGenerator(type: ButtonTypes): ButtonColors {
  when (type) {
    ButtonTypes.success -> return ButtonDefaults.buttonColors(
      backgroundColor = Color.Green,
      contentColor = Color.White

    )
    ButtonTypes.error -> return ButtonDefaults.buttonColors(
      backgroundColor = Color.Red,
      contentColor = Color.White

    )
  }

}

@Preview
@Composable
fun ButtonPreview() {

}