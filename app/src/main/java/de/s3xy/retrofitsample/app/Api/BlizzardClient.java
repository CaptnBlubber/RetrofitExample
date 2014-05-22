package de.s3xy.retrofitsample.app.Api;

import retrofit.RestAdapter;

/**
 * +        o     o       +        o
 * -_-_-_-_-_-_-_,------,      o
 * _-_-_-_-_-_-_-|   /\_/\
 * -_-_-_-_-_-_-~|__( ^ .^)  +     +
 * _-_-_-_-_-_-_-"  ""
 * +      o         o   +       o
 * Created By: {USER}
 */
public class BlizzardClient {

        private static BlizzardApiInterface sBlizzardService;

        public static BlizzardApiInterface getBlizzardApiClient() {
            if (sBlizzardService == null) {
                RestAdapter restAdapter = new RestAdapter.Builder()
                        .setEndpoint("http://eu.battle.net/api")
                        .setLogLevel(RestAdapter.LogLevel.FULL)
                        .build();

                sBlizzardService = restAdapter.create(BlizzardApiInterface.class);
            }

            return sBlizzardService;
        }


}
