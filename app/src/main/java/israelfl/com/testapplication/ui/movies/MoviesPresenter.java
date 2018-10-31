package israelfl.com.testapplication.ui.movies;

import android.support.annotation.NonNull;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import israelfl.com.testapplication.data.DataManager;
import israelfl.com.testapplication.di.module.submodule.MoviesModule;
import israelfl.com.testapplication.ui.base.BasePresenter;
import israelfl.com.testapplication.utils.schedulers.BaseSchedulerProvider;

/**
 * Listens to user actions from the UI ({@link MoviesActivity}), retrieves the data and
 * updates the UI as required.
 * <p/>
 * By marking the constructor with {@code @Inject}, Dagger injects the dependencies required to
 * create an instance of the TasksPresenter (if it fails, it emits a compiler error).  It uses
 * {@link MoviesModule} to do so.
 * <p/>
 * Dagger generated code doesn't require public access to the constructor or class, and
 * therefore, to ensure the developer doesn't instantiate the class manually and bypasses Dagger,
 * it's good practice minimise the visibility of the class/constructor as much as possible.
 **/
public class MoviesPresenter<V extends MoviesMvpView> extends BasePresenter<V> implements
        MoviesMvpPresenter<V> {

    @Inject
    public MoviesPresenter(@NonNull DataManager dataManager,
                           @NonNull BaseSchedulerProvider schedulerProvider,
                           @NonNull CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void attach(V view) {
        super.attach(view);
    }

}