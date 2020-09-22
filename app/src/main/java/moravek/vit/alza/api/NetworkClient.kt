package moravek.vit.alza.api

import okhttp3.Headers
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object NetworkClient {

    fun getRetrofit(): Retrofit {

        return Retrofit.Builder()
            .baseUrl("https://www.alza.cz")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}