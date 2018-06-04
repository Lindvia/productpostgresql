package com.belajar.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties
data class PushMessageResponse(
        var message: String = ""
)