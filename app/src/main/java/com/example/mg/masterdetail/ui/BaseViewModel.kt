package com.example.mg.masterdetail.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mg.masterdetail.data.Failure
import com.example.mg.masterdetail.data.Result
import kotlinx.coroutines.CoroutineExceptionHandler
import java.io.IOException

open class BaseViewModel() : ViewModel() {

    private val _errorObserver = MutableLiveData<Result.Error>()

    val errorObserver: LiveData<Result.Error>
        get() = _errorObserver


    internal val handler = CoroutineExceptionHandler { _, e ->
        when (e) {
            is IOException -> _errorObserver.value = Result.Error.NetworkError
            is Failure.ServerException -> _errorObserver.value = Result.Error.ServerError(null)
            is Failure.InvalidUser -> _errorObserver.value = Result.Error.InvalidUser
        }
    }

    fun errorHandler(error: Result.Error) {
        _errorObserver.value = error
        when (error) {
            Result.Error.ServerError(null) -> TODO()
            Result.Error.InvalidUser -> TODO()
            Result.Error.NetworkError -> TODO()
        }
    }
}