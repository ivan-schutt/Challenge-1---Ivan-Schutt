package com.example.myapplication.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.components.CustomButton
import com.example.myapplication.ui.components.ButtonType
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun WelcomeScreen(modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
      
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Imagen principal - más grande
            Image(
                painter = painterResource(id = R.drawable.welcome),
                contentDescription = "Welcome illustration",
                modifier = Modifier
                    .size(370.dp)
                    .padding(bottom = 10.dp)
            )
            


            Spacer(modifier = Modifier.height(25.dp))


            Text(
                text = "Discover Your\nDream Job here",  
                style = MaterialTheme.typography.headlineMedium,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(horizontal = 32.dp)
            )
            

            Spacer(modifier = Modifier.height(30.dp))
            

            Text(
                text = "Explore all the existing job roles based on your\ninterest and study major",
                style = MaterialTheme.typography.bodyMedium,  // ← Ya usa Poppins Weight 600
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(horizontal = 32.dp)
            )
        }
        

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)  // ← Espacio entre botones
        ) {

            CustomButton(
                text = "Login",
                onClick = { 
                    // TODO: Navegar a LoginScreen
                },
                type = ButtonType.PRIMARY,
                modifier = Modifier.weight(1f)  // ← Cada botón ocupa la mitad del ancho
            )
            

            CustomButton(
                text = "Register",
                onClick = { 
                    // TODO: Navegar a RegisterScreen
                },
                type = ButtonType.SECONDARY,
                modifier = Modifier.weight(1f)
            )
        }
        

        Spacer(modifier = Modifier.height(42.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    MyApplicationTheme {
        WelcomeScreen(modifier = Modifier.fillMaxSize())
    }
}