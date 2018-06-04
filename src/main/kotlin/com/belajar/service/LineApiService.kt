package com.belajar.service

import com.belajar.dto.PushMessageResponse
import java.util.concurrent.Future


interface LineApiService {

    fun pushMessage(channelAccessToken:
                    String,lineUserId: String, message: String): Future<PushMessageResponse>

}