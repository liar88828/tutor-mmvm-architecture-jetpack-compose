package com.tutor.mvvm_architecture_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tutor.mvvm_architecture_jetpack_compose.ui.theme.MVVMArchitecturejetpackcomposeTheme
import com.tutor.mvvm_architecture_jetpack_compose.view.home.viewmodel.HomeScreen
import com.tutor.mvvm_architecture_jetpack_compose.view.home.viewmodel.UserVM

class MainActivity : ComponentActivity() {
	private val userVM: UserVM by viewModels()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			MVVMArchitecturejetpackcomposeTheme {
				val userState = userVM.names.collectAsState()

				Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
					HomeScreen(
						users = userState.value
					)
				}
			}
		}
	}
}

