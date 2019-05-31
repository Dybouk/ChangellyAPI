package com.herzbrun.changellyinterface;

public class UtilsChangellyApi {
    public static final String BASE_URL = "https://api.changelly.com";


    public static ChangellyService getAPIService(){
        return RetrofitBaseApi.getClient().create(ChangellyService.class);
    }
}