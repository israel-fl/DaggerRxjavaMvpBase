package israelfl.com.testapplication.data;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import israelfl.com.testapplication.data.source.network.ApiHelper;
import israelfl.com.testapplication.data.source.preferences.PreferencesHelper;

/**
 * Created by israel on 10/20/18.
 */
@Singleton
public class AppDataManager implements DataManager {

    private final Context mContext;
    private final PreferencesHelper mSessionManager;
    private final ApiHelper mApiHelper;

    @Inject
    public AppDataManager(Context context,
                          PreferencesHelper sessionManager,
                          ApiHelper apiHelper) {
        mContext = context;
        mSessionManager = sessionManager;
        mApiHelper = apiHelper;
    }

}
