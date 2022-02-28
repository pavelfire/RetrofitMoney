package com.vk.directop.retrofitmoney.data.api

import com.vk.directop.retrofitmoney.model.beznal.Beznal
import com.vk.directop.retrofitmoney.model.beznal.BeznalItem
import com.vk.directop.retrofitmoney.model.nal.Nalichka
import com.vk.directop.retrofitmoney.model.nal.NalichkaItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoney(): Response<Nalichka>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoney(): Response<Beznal>
}

//https://api.privatebank.ua/p24api/pubinfo?json&exchange&coursid=5