package com.example.myapplication.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme


enum class ButtonType {
    PRIMARY,    
    SECONDARY   
}

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    type: ButtonType = ButtonType.PRIMARY,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    when (type) {
        ButtonType.PRIMARY -> {
            Button(
                onClick = onClick,
                enabled = enabled,
                modifier = modifier
                    .height(56.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            ) {
                Text(
                    text = text,
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.Medium
                )
            }
        }
        
        ButtonType.SECONDARY -> {
            Button(
                onClick = onClick,
                enabled = enabled,
                modifier = modifier
                    .height(56.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = MaterialTheme.colorScheme.onSurface
                )
            ) {
                Text(
                    text = text,
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CustomButtonPreview() {
    MyApplicationTheme {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            CustomButton(
                text = "Login",
                onClick = { },
                type = ButtonType.PRIMARY,
                modifier = Modifier.fillMaxWidth()
            )
            
            CustomButton(
                text = "Register",
                onClick = { },
                type = ButtonType.SECONDARY,
                modifier = Modifier.fillMaxWidth()
            )
            
            // Ejemplo de botón deshabilitado
            CustomButton(
                text = "Disabled",
                onClick = { },
                type = ButtonType.PRIMARY,
                enabled = false,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}