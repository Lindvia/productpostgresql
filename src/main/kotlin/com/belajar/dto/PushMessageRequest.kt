package com.belajar.dto

data class PushMessageRequest(
        var to: String = "",
        var messages: MutableList<MessageText> = ArrayList()
)