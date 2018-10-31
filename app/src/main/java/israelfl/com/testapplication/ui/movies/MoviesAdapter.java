package israelfl.com.testapplication.ui.movies;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.Collections;
import java.util.List;

import israelfl.com.testapplication.R;
import israelfl.com.testapplication.data.source.network.model.Movie;

/**
 * RecyclerView Adapter for a custom view based on the {@link Movie} model.
 */
public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {

    private LayoutInflater inflater;
    private List<Movie> mBookList = Collections.emptyList();
    private View view;
    private Context mContext;

    public MoviesAdapter(Context context, List<Movie> bookList) {
        inflater = LayoutInflater.from(context);
        mContext = context;
        this.mBookList = bookList;
    }

    @Override
    public MoviesAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = inflater.inflate(R.layout.item_movie, parent, false);
        return new MoviesAdapter.MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MoviesAdapter.MovieViewHolder holder, int position) {
        Movie current = mBookList.get(position);

        // Ask Picasso to populate the view from the given URL
        Picasso.with(mContext).load(current.getImageUrl()).into(holder.ivBook);
        holder.tvTitle.setText(current.getName());
    }

    @Override
    public int getItemCount() {
        return mBookList.size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivBook;
        private TextView tvTitle;

        public MovieViewHolder(View view) {
            super(view);
//            ivBook = view.findViewById(R.id.);
//            tvTitle = view.findViewById(R.id.tv_title);
        }

    }

}