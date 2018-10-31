package israelfl.com.testapplication.data.source.network.model;

import com.google.gson.annotations.SerializedName;

/**
 * Immutable model class for a Movie object
 */
public class Movie {

    @SerializedName("name")
    String name;

    @SerializedName("image_url")
    String imageUrl;

    public Movie() {
        // No args constructor for use in deserialization
    }

    public Movie(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
