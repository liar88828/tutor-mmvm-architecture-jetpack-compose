package com.tutor.mvvm_architecture_jetpack_compose.data.repository

import com.tutor.mvvm_architecture_jetpack_compose.data.model.User
import kotlinx.coroutines.delay

class UserRepo : IUserRepo {
	override suspend fun getName(): List<User> {
		delay(4000)
		return listOf(
			User("Alan", 54),
			User("John", 32),
			User("Sarah", 12),
		)

	}
}