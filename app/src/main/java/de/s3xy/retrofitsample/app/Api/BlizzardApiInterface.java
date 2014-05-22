package de.s3xy.retrofitsample.app.Api;

import de.s3xy.retrofitsample.app.Models.Profile;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * +        o     o       +        o
 * -_-_-_-_-_-_-_,------,      o
 * _-_-_-_-_-_-_-|   /\_/\
 * -_-_-_-_-_-_-~|__( ^ .^)  +     +
 * _-_-_-_-_-_-_-"  ""
 * +      o         o   +       o
 * Created By: {USER}
 */
public interface BlizzardApiInterface {
        @GET("/d3/profile/{battleTag}/")
        Profile profile(@Path("battleTag") String battleTag);
}
