package com.vk.directop.retrofitmoney.screens.first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vk.directop.retrofitmoney.data.repository.Repository
import com.vk.directop.retrofitmoney.model.nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class FirstViewModel : ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getNal()
        }
    }
}