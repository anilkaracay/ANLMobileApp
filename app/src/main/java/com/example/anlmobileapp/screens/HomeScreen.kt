package com.example.anlmobileapp.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.anlmobileapp.components.ANLImageBox
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.anlmobileapp.R
import com.example.anlmobileapp.components.ANLButton
import com.example.anlmobileapp.components.ANLInput
import com.example.anlmobileapp.enums.ButtonTypes


@Composable
fun HomeScreen(navController: NavController, firstname: String?) {
  var username by rememberSaveable { mutableStateOf("") }

  Surface(Modifier.fillMaxSize()) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
      Row(modifier = Modifier.fillMaxWidth()) {
        Box(Modifier.weight(1f)) {
          ANLImageBox(
            leftIcon = painterResource(id = R.drawable.pikachu),
            title = "Pikachu",
            subtitle = "Küçük Pikachu",
            description = "Çok küçük Pikachu",
            rightIcon = painterResource(id = R.drawable.pikachu)
          )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Box(Modifier.weight(1f)) {
          ANLImageBox(
            leftIcon = painterResource(id = R.drawable.pikachu),
            title = "Pikachu",
            subtitle = "Küçük Pikachu",
            description = "Çok küçük Pikachu",
          )
        }
      }
      Spacer(modifier = Modifier.height(25.dp))
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .border(2.dp, color = Color.Black)
      ) {
        LazyColumn(modifier = Modifier.border(6.dp, Color.Red)) {
          items(2) { index ->
            ANLImageBox(
              leftIcon = painterResource(id = R.drawable.pikachu),
              title = "Pikachu",
              subtitle = "Küçük Pikachu",
              description = "Çok küçük Pikachu",
              rightIcon = painterResource(
                id = R.drawable.pikachu
              )
            )
          }
        }
      }
      if (firstname != null) {
        Text(text = "Adınız:$firstname")
      } else {
        Text(text = "Adınız:")
      }
      Spacer(Modifier.height(15.dp))
      ANLInput(
        value = username,
        onValueChange = { username = it },
        label = "Kullanıcı adı: $username",
        icon = R.drawable.hello
      )
      Spacer(modifier = Modifier.height(20.dp))
      Image(
        painter = painterResource(id = R.drawable.barbara),
        contentDescription = "aşk kadın",
        modifier = Modifier.size(250.dp), alignment = Alignment.Center
      )
      Spacer(modifier = Modifier.height(20.dp))
      ANLButton(
        onClick = { navController.navigate("detail") },
        text = "Giriş Yap",
        type = ButtonTypes.success,
        shape = MaterialTheme.shapes.large,
        modifier = Modifier
          .fillMaxWidth()
          .padding(horizontal = 20.dp)
      )
    }
  }

}
