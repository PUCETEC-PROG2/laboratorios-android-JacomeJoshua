package ec.edu.puce.githubclient.ViewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ec.edu.puce.githubclient.models.RepositoryPayload
import ec.edu.puce.githubclient.services.RetrofitClient
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch



class RepoFormViewModel : ViewModel(){
    private val _isLoading = MutableStateFlow(value = false)
    val isLoading : StateFlow<Boolean> = _isLoading.asStateFlow()

    private val _errorMsg = MutableStateFlow<String?>(null)

    val errorMsg: StateFlow<String?> = _errorMsg.asStateFlow()
    private val _isSuccess= MutableStateFlow(false)

    val isSuccess : StateFlow<Boolean> = _isSuccess.asStateFlow()

    fun createRepo (name: String, description: String){
        viewModelScope.launch {
            _isLoading.value = true
            _errorMsg.value = null
            try {
                val repoBody = RepositoryPayload(name, description)
                RetrofitClient.apiService.createRepository(repository = repoBody)
                _isSuccess.value = true

            } catch ( e: Exception) {
                _errorMsg.value = "Error al cargar respositorio: ${e.localizedMessage}"
            } finally {
                _isLoading.value = false
            }
        }
    }
    fun resetSuccess() {
        _isSuccess.value
    }
    fun resetError(){
        _errorMsg.value= null
    }

}