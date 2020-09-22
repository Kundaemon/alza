package moravek.vit.alza.modules

import dagger.Module
import dagger.Provides
import moravek.vit.alza.api.NetworkClient

@Module
class ApiModule {

    @Provides
    fun provideNetworkClient(): NetworkClient = NetworkClient
}