package moravek.vit.alza.modules

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import moravek.vit.alza.AlzaApplication


@Component(
    modules = [
        AndroidInjectionModule::class,
        ApiModule::class,
        ActivityBuilder::class,
        AppModule::class
    ]
)
interface AppComponent : AndroidInjector<AlzaApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    //fun inject (app: AlzaApplication)
}