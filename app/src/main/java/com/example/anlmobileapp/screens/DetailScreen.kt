package com.example.anlmobileapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.NavController
import com.example.anlmobileapp.components.ANLButton
import com.example.anlmobileapp.components.ANLInput
import com.example.anlmobileapp.enums.ButtonTypes
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.navigate
import com.example.anlmobileapp.R


@Composable
fun DetailScreen(navController: NavController) {
  var firstname by rememberSaveable { mutableStateOf("") }
  var lastname by rememberSaveable { mutableStateOf("") }
  Surface() {
    Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center
    ) {

      ANLInput(value = firstname, onValueChange = { firstname = it }, label = "Adınız:$firstname")
      ANLInput(value = lastname, onValueChange = { lastname = it }, label = "Soyadınız:$lastname")
      Spacer(Modifier.height(20.dp))
      ANLButton(
        onClick = { navController.navigate("home/$firstname") },
        text = "Geri Dön",
        type = ButtonTypes.success,
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
          .fillMaxWidth()
          .padding(horizontal = 20.dp)
      )
      Spacer(modifier = Modifier.height(35.dp))
      Image(painter = painterResource(id = R.drawable.raze), contentDescription = null)


    }
  }
}