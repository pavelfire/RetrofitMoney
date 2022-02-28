package com.vk.directop.retrofitmoney.data.repository

import com.vk.directop.retrofitmoney.data.api.RetrofitInstance
import com.vk.directop.retrofitmoney.model.beznal.Beznal
import com.vk.directop.retrofitmoney.model.beznal.BeznalItem
import com.vk.directop.retrofitmoney.model.nal.Nalichka
import com.vk.directop.retrofitmoney.model.nal.NalichkaItem
import retrofit2.Response

class Repository {

    suspend fun getNal(): Response<Nalichka>{
        return RetrofitInstance.api.getNalMoney()
    }

    suspend fun getBeznal(): Response<Beznal>{
        return RetrofitInstance.api.getBeznalMoney()
    }
}