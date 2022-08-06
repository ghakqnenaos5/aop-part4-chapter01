package fastcapmus.aop.part4.chapter01.service

import fastcapmus.aop.part4.chapter01.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/1a6d98a3-0700-4cfd-8114-ccc9dbddaf56")
    fun listVideos(): Call<VideoDto>
}