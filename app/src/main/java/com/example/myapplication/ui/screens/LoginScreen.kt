package com.example.myapplication.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.components.CustomTextField
import com.example.myapplication.ui.components.PrimaryButton
import com.example.myapplication.ui.components.CustomButton
import com.example.myapplication.ui.components.ButtonType
import com.example.myapplication.ui.components.SocialButtonsRow
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
@Preview

fun LoginScreen(modifier: Modifier = Modifier) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(80.dp))
            

            Text(
                text = "Login here",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center
            )
            
            Spacer(modifier = Modifier.height(30.dp))
            

            Text(
                text = "Welcome back you've\nbeen missed!",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            

            Spacer(modifier = Modifier.height(40.dp))
        }
        

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(24.dp)  // ← Aumentado de 20.dp a 24.dp
        ) {
            // Campo Email
            CustomTextField(
                value = email,
                onValueChange = { email = it },
                placeholder = "Email",
                keyboardType = KeyboardType.Email
            )
            
            // Campo Password
            CustomTextField(
                value = password,
                onValueChange = { password = it },
                placeholder = "Password",
                isPassword = true,
                keyboardType = KeyboardType.Password
            )
            

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (-4).dp),
                horizontalArrangement = Arrangement.End
            ) {
                TextButton(
                    onClick = { /* TODO: Forgot password */ },
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        text = "Forgot your password?",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
            }
            

        }
        

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-12).dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            PrimaryButton(
                text = "Sign in",
                onClick = { /* TODO: Sign in logic */ }
            )
            

            TextButton(
                onClick = { /* TODO: Navigate to Register */ }
            ) {
                Text(
                    text = "Create new account",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            

            Spacer(modifier = Modifier.height(16.dp))
            

            Text(
                text = "Or continue with",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center
                ),
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            

            SocialButtonsRow(
                onGoogleClick = { /* TODO: Google login */ },
                onFacebookClick = { /* TODO: Facebook login */ },
                onAppleClick = { /* TODO: Apple login */ }
            )
        }
        

        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    MyApplicationTheme {
        LoginScreen()
    }
}