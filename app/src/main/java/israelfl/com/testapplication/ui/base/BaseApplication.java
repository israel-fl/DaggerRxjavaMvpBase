package israelfl.com.testapplication.ui.base;

import android.app.Application;
import android.support.annotation.VisibleForTesting;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import israelfl.com.testapplication.BuildConfig;
import israelfl.com.testapplication.data.DataManager;
import israelfl.com.testapplication.di.component.DaggerApplicationComponent;
import israelfl.com.testapplication.utils.logging.ReleaseTree;
import timber.log.Timber;

/**
 * We create a custom {@link Application} class that extends  {@link DaggerApplication}.
 * We then override applicationInjector() which tells Dagger how to make our @Singleton Component
 * We never have to call `component.inject(this)` as {@link DaggerApplication} will do that for us.
 */
public class BaseApplication extends DaggerApplication {

    @Inject
    DataManager mDataManager;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {

        // Setup loggers
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        return DaggerApplicationComponent.builder().application(this).build();
    }

    /**
     * Espresso tests need to be able to get an instance of the {@link DataManager}
     */
    @VisibleForTesting
    public DataManager getDataManager() {
        return mDataManager;
    }

}