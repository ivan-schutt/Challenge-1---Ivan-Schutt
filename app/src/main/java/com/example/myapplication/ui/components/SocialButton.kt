package com.example.myapplication.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun SocialButton(
    iconRes: Int,
    contentDescription: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .width(80.dp)
            .height(56.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = MaterialTheme.colorScheme.onSurface
        ),
        elevation = null,
        contentPadding = PaddingValues(
            top = 6.dp,
            bottom = 6.dp,
            start = 6.dp,
            end = 6.dp
        )
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = contentDescription,
            modifier = Modifier
                .size(200.dp),
            contentScale = ContentScale.Fit
        )
    }
}


@Composable
fun SocialButtonsRow(
    onGoogleClick: () -> Unit,
    onFacebookClick: () -> Unit,
    onAppleClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.wrapContentWidth(),
        horizontalArrangement = Arrangement.spacedBy(1.dp, Alignment.CenterHorizontally)
    ) {
        SocialButton(
            iconRes = R.drawable.google,
            contentDescription = "Continue with Google",
            onClick = onGoogleClick
        )
        
        SocialButton(
            iconRes = R.drawable.facebook,
            contentDescription = "Continue with Facebook",
            onClick = onFacebookClick
        )
        
        SocialButton(
            iconRes = R.drawable.apple,
            contentDescription = "Continue with Apple",
            onClick = onAppleClick
        )
    }
}


@Preview(showBackground = true)
@Composable
fun SocialButtonPreview() {
    MyApplicationTheme {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Botones individuales
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                SocialButton(
                    iconRes = R.drawable.google,
                    contentDescription = "Google",
                    onClick = { }
                )
                
                SocialButton(
                    iconRes = R.drawable.facebook,
                    contentDescription = "Facebook",
                    onClick = { }
                )
                
                SocialButton(
                    iconRes = R.drawable.apple,
                    contentDescription = "Apple",
                    onClick = { }
                )
            }
            

            Text("Usando SocialButtonsRow:")
            SocialButtonsRow(
                onGoogleClick = { },
                onFacebookClick = { },
                onAppleClick = { }
            )
        }
    }
}
