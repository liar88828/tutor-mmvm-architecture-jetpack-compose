package com.tutor.mvvm_architecture_jetpack_compose.view.home.viewmodel

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.unit.dp
import com.tutor.mvvm_architecture_jetpack_compose.data.model.User

@Composable
fun HomeScreen(modifier: Modifier = Modifier, users: List<User>) {
	LazyColumn(modifier = modifier) {
		items(users) { user ->
			Row {
				Text(
					text = user.name,
					style = MaterialTheme.typography.titleLarge
				)
				Spacer(Modifier.size(16.dp))
				Text(
					text = user.name,
					style = MaterialTheme.typography.titleMedium
				)
			}
		}
	}

}