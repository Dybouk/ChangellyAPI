package com.herzbrun.changellyinterface;

public interface ChangellyService {

    @POST("CurrenciesList")
    Call<CurrenciesList> getCurrencies(@Header("Content-Type") String content_type,
                                       @Header("api-key") String api_key,
                                       @Header("sign") String sign,
                                       @Body MainBody mainBody);

    @POST("MinAmount")
    Call<MinAmount> getMinAmount(@Header("Content-Type") String content_type,
                                 @Header("api-key") String api_key,
                                 @Header("sign") String sign,
                                 @Body MainBody mainBody);

    @POST("ExchangeAmount")
    Call<ExchangeAmount> getExchangeAmount(@Header("Content-Type") String content_type,
                                           @Header("api-key") String api_key,
                                           @Header("sign") String sign,
                                           @Body MainBody mainBody);


    @POST("CurrenciesFull")
    Call<CurrenciesFull> getCurrenciesFull(@Header("Content-Type") String content_type,
                                           @Header("api-key") String api_key,
                                           @Header("sign") String sign,
                                           @Body MainBody mainBody);

    @POST("GenerateAddress")
    Call<GenerateAddress> generateAddress(@Header("Content-Type") String content_type,
                                          @Header("api-key") String api_key,
                                          @Header("sign") String sign,
                                          @Body MainBody mainBody);

    @POST("ValidateAddress")
    Call<ValidateAddress> validateAddress(@Header("Content-Type") String content_type,
                                          @Header("api-key") String api_key,
                                          @Header("sign") String sign,
                                          @Body MainBody mainBody);

    @POST("CreateTransaction")
    Call<CreateTransaction> createTransaction(@Header("Content-Type") String content_type,
                                              @Header("api-key") String api_key,
                                              @Header("sign") String sign,
                                              @Body MainBody mainBody);
    @POST("Transaction")
    Call<Transaction> getTransaction(@Header("Content-Type") String content_type,
                                     @Header("api-key") String api_key,
                                     @Header("sign") String sign,
                                     @Body MainBody mainBody);
    @POST("Status")
    Call<Status> getStatus(@Header("Content-Type") String content_type,
                           @Header("api-key") String api_key,
                           @Header("sign") String sign,
                           @Body MainBody mainBody);
}