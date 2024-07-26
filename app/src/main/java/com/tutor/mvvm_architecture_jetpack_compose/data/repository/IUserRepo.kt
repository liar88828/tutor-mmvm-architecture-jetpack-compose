package com.tutor.mvvm_architecture_jetpack_compose.data.repository

import com.tutor.mvvm_architecture_jetpack_compose.data.model.User

interface IUserRepo {
	suspend fun getName():List<User>

}