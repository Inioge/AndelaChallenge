package com.example.admin.andelachallenge.service;

import com.example.admin.andelachallenge.model.UserList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ADMIN on 26/04/2017.
 */

public interface RestApiService {

    @GET("/search/users")
    Call<UserList> getUserList(@Query("q") String filter);

}
