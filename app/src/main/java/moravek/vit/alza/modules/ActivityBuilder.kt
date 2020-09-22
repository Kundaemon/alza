package moravek.vit.alza.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import moravek.vit.alza.activities.MainActivity

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}