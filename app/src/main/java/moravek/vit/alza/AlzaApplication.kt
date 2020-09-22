package moravek.vit.alza

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import moravek.vit.alza.modules.DaggerAppComponent
import javax.inject.Inject

class AlzaApplication : Application(), HasActivityInjector, HasSupportFragmentInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Activity>

    lateinit var androidFragmentInjector: DispatchingAndroidInjector<Fragment>


    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent
            .builder()
            .application(this)
            .build()
            .inject(this)

    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return androidInjector
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return androidFragmentInjector
    }
}