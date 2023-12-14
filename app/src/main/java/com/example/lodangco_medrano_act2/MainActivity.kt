package com.example.lodangco_medrano_act2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.lodangco_medrano_act2.theme.Lodangco_Medrano_Act2Theme
import com.example.lodangco_medrano_act2.interfaces.LogInForm

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lodangco_Medrano_Act2Theme{
                // Call your @Composable functions here
                Surface {
                    LogInForm()
                }
            }
        }
    }
}
