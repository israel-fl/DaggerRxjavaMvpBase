package israelfl.com.testapplication.di.module.submodule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;
import israelfl.com.testapplication.utils.schedulers.BaseSchedulerProvider;
import israelfl.com.testapplication.utils.schedulers.SchedulerProvider;

/**
 * This is a Dagger module. We use this to bind our RxJava Composite Disposable and
 * Scheduler Provider
 */
@Module
public abstract class BaseActivityModule {

    @Provides
    @Singleton
    static CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    @Singleton
    static BaseSchedulerProvider provideSchedulerProvider() {
        return SchedulerProvider.getInstance();
    }
}

