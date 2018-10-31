package israelfl.com.testapplication.utils.logging;

import timber.log.Timber;

public class ReleaseTree extends Timber.Tree {

    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
//        if (priority == ERROR || priority == WARNING) {
//        }
    }
}