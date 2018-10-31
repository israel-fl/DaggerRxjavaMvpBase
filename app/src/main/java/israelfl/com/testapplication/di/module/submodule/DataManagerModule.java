package israelfl.com.testapplication.di.module.submodule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import israelfl.com.testapplication.data.AppDataManager;
import israelfl.com.testapplication.data.DataManager;
import israelfl.com.testapplication.data.source.network.ApiHelper;
import israelfl.com.testapplication.data.source.network.AppApiHelper;
import israelfl.com.testapplication.data.source.preferences.AppPreferencesHelper;
import israelfl.com.testapplication.data.source.preferences.PreferencesHelper;

/**
 * This is used by Dagger to inject the required arguments into the {@link DataManager}.
 */
@Module
abstract public class DataManagerModule {

    @Provides
    @Singleton
    static DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    static PreferencesHelper providePreferencesHelper(AppPreferencesHelper session) {
        return session;
    }

    @Provides
    @Singleton
    static ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

}
