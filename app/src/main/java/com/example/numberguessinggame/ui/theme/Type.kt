package com.example.numberguessinggame.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.numberguessinggame.R

// Set of Material typography styles to start with
val Comfortaa = FontFamily(
    Font(R.font.comfortaa_bold, FontWeight.Bold),
    Font(R.font.comfortaa_light,FontWeight.Light),
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Comfortaa,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    body1 = TextStyle(
        fontFamily = Comfortaa,
        fontWeight = FontWeight.Light,
        fontSize = 30.sp
    )
)

