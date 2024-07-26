package com.tutor.mvvm_architecture_jetpack_compose.view.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tutor.mvvm_architecture_jetpack_compose.data.model.User
import com.tutor.mvvm_architecture_jetpack_compose.data.repository.IUserRepo
import com.tutor.mvvm_architecture_jetpack_compose.data.repository.UserRepo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class UserVM(
	private val repository: IUserRepo = UserRepo()
) : ViewModel() {
	private val _users = MutableStateFlow<List<User>>(emptyList())
	val names: StateFlow<List<User>>
		get() = _users

	init {
		load()
	}

	private fun load() {
		viewModelScope.launch {
			_users.value = repository.getName()
		}
	}

}