package com.stocks.stocks_io.Model;

import com.stocks.stocks_io.POJO.BaseMessage;
import com.stocks.stocks_io.POJO.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UsersModel {

    @POST("users/register")
    @FormUrlEncoded
    Call<BaseMessage> registerUser(@Field("username") String username,
                                   @Field("password") String password,
                                   @Field("firstName") String firstName,
                                   @Field("lastName") String lastName,
                                   @Field("email") String email);

    @POST("users/login")
    @FormUrlEncoded
    Call<LoginResponse> loginUser(@Field("username") String username,
                                  @Field("password") String password);
}
