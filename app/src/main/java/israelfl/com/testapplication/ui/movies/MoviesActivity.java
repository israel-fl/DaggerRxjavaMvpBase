package israelfl.com.testapplication.ui.movies;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.ButterKnife;
import israelfl.com.testapplication.R;
import israelfl.com.testapplication.ui.base.BaseActivity;


public class MoviesActivity extends BaseActivity implements MoviesMvpView {

    @Inject
    MoviesMvpPresenter<MoviesMvpView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_movies);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.attach(this);

        // Setup activity
        setup();

    }

    @Override
    protected void setup() {

        bindListeners();

    }

    @Override
    protected void setupAnalytics() {

    }

    @Override
    public boolean isNetworkConnected() {
        return false;
    }

    @Override
    public void bindListeners() {

    }

    @Override
    public void showNoNetworkSnack() {

    }

    @Override
    public void showSnackbar(String message) {

    }

}
