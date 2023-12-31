package com.example.allknightrapp.data.remote

import com.example.allknightrapp.data.remote.MessageService.Endpoints.GetAllMessages.url
import com.example.allknightrapp.domain.model.Message

interface MessageService {

    suspend fun getAllMessages(): List<Message>

    companion object {
        const val BASE_URL = "http://10.0.2.2:8080"
    }

    sealed class Endpoints(val url: String) {
        object GetAllMessages: Endpoints("$BASE_URL/messages")
    }
}