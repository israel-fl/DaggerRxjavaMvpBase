package israelfl.com.testapplication.data.source.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Inject;

/**
 * Created by israel on 10/20/18.
 */

public class AppPreferencesHelper implements PreferencesHelper {

    private SharedPreferences prefs;

    @Inject
    public AppPreferencesHelper(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

}
