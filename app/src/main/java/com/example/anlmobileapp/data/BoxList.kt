package com.example.anlmobileapp.data

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable

data class BoxList(val name:String)

@Composable
fun MyExample() {
  var selectedCity = rememberSaveable { mutableStateOf(BoxList("Madrid")) }
}
