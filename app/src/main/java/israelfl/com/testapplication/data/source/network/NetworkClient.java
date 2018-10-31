package israelfl.com.testapplication.data.source.network;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import israelfl.com.testapplication.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Singleton
public class NetworkClient {

    private static Retrofit retrofit;

    private static OkHttpClient okHttpClient;

    private NetworkClient() {
        // Not publicly instantiable
    }

    static Retrofit getRetrofit() {

        if (okHttpClient == null) {
            initOkHttp();
        }

        Gson gson = new GsonBuilder().create();

        retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.API_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();

        return retrofit;

    }

    private static void initOkHttp() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        HttpLoggingInterceptor headerLogs = new HttpLoggingInterceptor();
        headerLogs.setLevel(HttpLoggingInterceptor.Level.HEADERS);

        okHttpClient = new OkHttpClient().newBuilder()
                .addInterceptor(logging)
                .addInterceptor(headerLogs).build();
    }

}