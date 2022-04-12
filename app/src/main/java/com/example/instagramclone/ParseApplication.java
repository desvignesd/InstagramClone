package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // set applicationId, and server server based on the values in the back4app settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("FOxanpnsUthsNVotF8oHFblKE1DhMnFwlEox4fpt") // should correspond to Application Id env variable
                .clientKey("DesOgySJ9fh5vG1sCnTvgN6XDakEUGJBUvLdtBi9")  // should correspond to Client key env variable
                .server("https://parseapi.back4app.com").build());
    }
}
