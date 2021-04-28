package com.example.anlmobileapp.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.anlmobileapp.R

@Composable
fun ANLImageBox(
  leftIcon: Painter,
  title: String,
  subtitle: String,
  description: String,
  rightIcon: Painter? = null

) {
  Row(
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
      .border(1.dp, Color.Black)
      .fillMaxWidth()
  ) {
    Icon(
      painter = leftIcon,
      contentDescription = null,
      modifier = Modifier
        .height(50.dp)
        .width(50.dp)
        .padding(start = 3.dp),
      tint = MaterialTheme.colors.primary
    )
    Column(
      modifier = Modifier
        .padding(6.dp, 8.dp)
        .weight(1f),
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      Text(
        text = title,
        fontSize = 18.sp,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
      )
      Text(
        text = subtitle,
        fontSize = 14.sp,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
      )
      Text(
        text = description,
        fontSize = 12.sp,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
      )


    }
    if (rightIcon != null) {
      Icon(
        painter = rightIcon,
        contentDescription = null,
        modifier = Modifier
          .height(50.dp)
          .width(50.dp)
          .padding(end = 3.dp),
        tint = MaterialTheme.colors.secondary
      )
    }

  }


}

@Preview(showBackground = true)
@Composable
fun ImageBoxPreview() {
  ANLImageBox(
    leftIcon = painterResource(id = R.drawable.pikachu),
    title = "Pikachu",
    subtitle = "Harika Pikachu",
    description = "Ateşli Pikachu",
    rightIcon = painterResource(id = R.drawable.pikachu)
  )

}
