package israelfl.com.testapplication.di.module.submodule;

import dagger.Binds;
import dagger.Module;
import israelfl.com.testapplication.di.ActivityScoped;
import israelfl.com.testapplication.ui.movies.MoviesMvpPresenter;
import israelfl.com.testapplication.ui.movies.MoviesMvpView;
import israelfl.com.testapplication.ui.movies.MoviesPresenter;


@Module
abstract public class MoviesModule {

    @Binds
    @ActivityScoped
    abstract MoviesMvpPresenter<MoviesMvpView> moviesPresenter(MoviesPresenter<MoviesMvpView> presenter);

}
