package com.example.anlmobileapp.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.anlmobileapp.R

@Composable
fun ANLInput(
  value: String,
  onValueChange: (String) -> Unit,
  label: String? = null,
  @DrawableRes icon: Int? = null,
  onPress: (() -> Unit)? = null
) {
  Column() {
    if (label != null) {
      Text(text = label)
    }
    TextField(value = value, onValueChange = onValueChange, trailingIcon = {
      IconButton(onClick = { }) {
        if (onPress != null) {
          IconButton(
            onClick = onPress,
            content = {
              RenderIcon(icon)
            })
        } else if (icon != null) {
          RenderIcon(icon)

        }

      }
    })

  }

}

@Composable
private fun RenderIcon(@DrawableRes icon: Int? = null) {
  if (icon!=null){
    Icon(
      painter = painterResource(id = icon),
      contentDescription = null
    )
  }

}


@Preview
@Composable
fun InputPreview() {
  var username by rememberSaveable { mutableStateOf("") }

  ANLInput(value = username, onValueChange = { username = it }, label = "Kullanıcı adı: $username")

}