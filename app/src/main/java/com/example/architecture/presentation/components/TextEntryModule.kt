package com.example.architecture.presentation.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun TextEntryModule(description: String, hint: String, imageVector: ImageVector, textValue: String, keyboardType: KeyboardType = KeyboardType.Ascii, visualTransformation: VisualTransformation = VisualTransformation.None, textColor: Color, cursorColor: Color, onValueChanged: (String) -> Unit, trailingIcon: ImageVector? = null, onTrailingIconClick: (() -> Unit)?, modifier: Modifier = Modifier) {
}