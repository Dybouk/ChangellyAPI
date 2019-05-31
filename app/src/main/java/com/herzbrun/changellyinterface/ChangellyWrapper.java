package com.herzbrun.changellyinterface;

public class ChangellyWrapper {

    //private GetCurrenciesInterface setCurrenciesListener;
    private GetCurrencyFullInterface setCurrencyFullListener;
    private ExchangeAmountInterface setExchangeAmountListener;
    private MinAmountInterface setMinAmountListener;
    //private GenerateAddressInterface setgenerateAddressListener;
    private ValidateAddressInterface setValidateAddressListener;
    private CreateTransactionInterface setCreateTransactionListener;
    private GetTransactionInterface setTransactionListener;
    private GetStatusInterface setStatusListener;

    public ChangellyWrapper() {
        //this.setCurrenciesListener = null;
        this.setExchangeAmountListener = null;
        this.setMinAmountListener = null;
        this.setCurrencyFullListener = null;
        //this.setgenerateAddressListener = null;
        this.setValidateAddressListener = null;
        this.setCreateTransactionListener = null;
        this.setTransactionListener = null;
        this.setStatusListener = null;
    }
// Returns a list of enabled currencies as a flat array.
// Use GetCurrenciesFull instead to return currencies in spinner.
// Connect to model.CurrenciesList.

    /* public interface GetCurrenciesInterface {
        void onGetCurrenciesInterface(List<String> result);
    }

    public void setCurrenciesListener(GetCurrenciesInterface getCurrenciesListener) {
        this.setCurrenciesListener = getCurrenciesListener;
    }

    public void getCurrencies() {

        MainBody mainBody = new MainBody();
        mainBody.setId(1);
        mainBody.setJsonrpc("2.0");
        mainBody.setMethod("getCurrencies");
        Params params = new Params();
        mainBody.setParams(params);
        String sign = null;
        try {
            sign = SignChangelly.hmacDigest(new Gson().toJson(mainBody), Constants.secret_key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChangellyService service = RetrofitBaseApi.getClient().create(ChangellyService.class);
        Call<CurrenciesList> call = service.getCurrencies("application/json", Constants.api_key, sign, mainBody);
        call.enqueue(new Callback<CurrenciesList>() {

            @Override
            public void onResponse(Call<CurrenciesList> call, Response<CurrenciesList> response) {
                Log.i("DownloadCurrenciesListSuccess", "" + response.toString());
            }

            @Override
            public void onFailure(Call<CurrenciesList> call, Throwable t) {
                Log.i("DownloadCurrenciesListFail", t.getMessage());
            }
        });

    }*/

// Returns a minimum allowed payin amount required for a currency pair.
// Amounts less than a minimal will most likely fail the transaction.
// Connect to model.GetMinAMount.

    public interface MinAmountInterface {
        void onMinAmountInterface(String result);
    }

    public void setMinAmountListener(MinAmountInterface setMinAmountListener) {
        this.setMinAmountListener = setMinAmountListener;
    }

    public void getMinAmount(String from, String to) {

        MainBody mainBody = new MainBody();
        mainBody.setId(1);
        mainBody.setJsonrpc("2.0");
        mainBody.setMethod("getMinAmount");
        Params params = new Params();
        //params.setAddress(address);
        params.setTo(to);
        params.setFrom(from);
        //params.setAmount(amount);
        //params.setId(id);
        mainBody.setParams(params);
        String sign = null;
        try {
            sign = SignChangelly.hmacDigest(new Gson().toJson(mainBody), Constants.secret_key);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ChangellyService service = RetrofitBaseApi.getClient().create(ChangellyService.class);
        Call<MinAmount> call = service.getMinAmount("application/json", Constants.api_key, sign, mainBody);
        call.enqueue(new Callback<MinAmount>() {

            @Override
            public void onResponse(Call<MinAmount> call, Response<MinAmount> response) {
                if (response.isSuccessful()) {
                    //loading.dismiss();
                    String result;
                    result = response.body().getResult();
                    if (setMinAmountListener != null)
                        setMinAmountListener.onMinAmountInterface(result);
                } else {
                    // loading.dismiss();
                    Toast.makeText((Context) setMinAmountListener, "Failed to fetch data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<MinAmount> call, Throwable t) {
                Log.i("DownloadGetMinAmountFail", t.getMessage());
            }
        });
    }

// Returns estimated exchange value with your API partner fee included.
// Connect to model.GetExchangeAmount.

    public interface ExchangeAmountInterface {
        void onExchangeAmountInterface(String result);
    }

    public void setExchangeAmountListener(ExchangeAmountInterface setExchangeAmountListener) {
        this.setExchangeAmountListener = setExchangeAmountListener;
    }

    public void getExchangeAmount(String from, String to, String amount) {
        MainBody mainBody = new MainBody();
        mainBody.setId(1);
        mainBody.setJsonrpc("2.0");
        mainBody.setMethod("getExchangeAmount");
        Params params = new Params();
        params.setTo(to);
        params.setFrom(from);
        params.setAmount(amount);
        mainBody.setParams(params);
        String sign = null;
        try {
            sign = SignChangelly.hmacDigest(new Gson().toJson(mainBody), Constants.secret_key);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ChangellyService service = RetrofitBaseApi.getClient().create(ChangellyService.class);
        Call<ExchangeAmount> call = service.getExchangeAmount("application/json", Constants.api_key, sign, mainBody);
        call.enqueue(new Callback<ExchangeAmount>() {

            @Override
            public void onResponse(Call<ExchangeAmount> call, Response<ExchangeAmount> response) {
                if (response.isSuccessful()) {
                    //loading.dismiss();
                    String result;
                    result = response.body().getResult();
                    if (setExchangeAmountListener != null)
                        setExchangeAmountListener.onExchangeAmountInterface(result);
                } else {
                    // loading.dismiss();
                    Toast.makeText((Context) setExchangeAmountListener, "Failed to fetch data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ExchangeAmount> call, Throwable t) {
                Log.i("DownloadGetExchangeAmountFail", t.getMessage());
            }
        });
    }


// Returns a full list of currencies as an array of objects.
// Each object has an "enabled" field displaying current availability of a coin.
// Connect to model.CurrenciesFullValue and model.CurrenciesFull.

    public interface GetCurrencyFullInterface {
        void onGetCurrencyFullInterface(List<CurrenciesFullValue> currencyName);
    }

    public void setCurrencyFullListener(GetCurrencyFullInterface setCurrencyFullListener) {
        this.setCurrencyFullListener = setCurrencyFullListener;
    }

    public void getCurrenciesFull() {

        MainBody mainBody = new MainBody();
        mainBody.setId(1);
        mainBody.setJsonrpc("2.0");
        mainBody.setMethod("getCurrenciesFull");
        Params params = new Params();
        mainBody.setParams(params);
        String sign = null;
        try {
            sign = SignChangelly.hmacDigest(new Gson().toJson(mainBody), Constants.secret_key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChangellyService service = RetrofitBaseApi.getClient().create(ChangellyService.class);
        Call<CurrenciesFull> call = service.getCurrenciesFull("Application/json", Constants.api_key, sign, mainBody);
        call.enqueue(new Callback<CurrenciesFull>() {

            @Override
            public void onResponse(Call<CurrenciesFull> call, Response<CurrenciesFull> response) {
                //Log.i("DownloadGetCurrenciesFullSuccess", "" + response.toString());
                if (response.isSuccessful()) {
                    //loading.dismiss();
                    List<CurrenciesFullValue> currencyName;
                    currencyName = response.body().getResult();
                    if (setCurrencyFullListener != null)
                        setCurrencyFullListener.onGetCurrencyFullInterface(currencyName);
                } else {
                    // loading.dismiss();
                    Toast.makeText((Context) setCurrencyFullListener, "Failed to fetch data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<CurrenciesFull> call, Throwable t) {
                //loading.dismiss();
                Toast.makeText((Context) setCurrencyFullListener, "Failed", Toast.LENGTH_SHORT).show();
            }
        });

    }

// Deprecated. Returns a pay-in address. A transaction ID will be generated later, while processing of the pay-in (when we will receive money).
// It’s better to use the "createTransaction" method instead, as "createTransaction" returns "transactionId" to monitor a transaction status.
// Connect to model.GenerateAddress and model.AddressValue.

    /* public interface GenerateAddressInterface {
        void onGenerateAddressInterface(AddressValue addressValue);
    }

    public void setgenerateAddressListener(GenerateAddressInterface setgenerateAddressListener) {
        this.setgenerateAddressListener = setgenerateAddressListener;
    }

     public void generateAddress() {
        MainBody mainBody = new MainBody();
        mainBody.setId(1);
        mainBody.setJsonrpc("2.0");
        mainBody.setMethod("generateAddress");
        Params params = new Params();
        mainBody.setParams(params);
        String sign = null;
        try {
            sign = SignChangelly.hmacDigest(new Gson().toJson(mainBody), Constants.secret_key);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ChangellyService service = RetrofitBaseApi.getClient().create(ChangellyService.class);
        Call<GenerateAddress> call = service.generateAddress("application/json", Constants.api_key, sign, mainBody);
        call.enqueue(new Callback<GenerateAddress>() {

            @Override
            public void onResponse(Call<GenerateAddress> call, Response<GenerateAddress> response) {
                // Log.i("DownloadGenerateAddressSuccess", "" + response.toString());
                if (response.isSuccessful()) {
                    //loading.dismiss();
                    AddressValue addressValue;
                    addressValue = response.body().getAddressValue();
                    if (setgenerateAddressListener != null)
                        setgenerateAddressListener.onGenerateAddressInterface(addressValue);
                } else {
                    // loading.dismiss();
                    Toast.makeText((Context) setCurrencyFullListener, "Failed to fetch data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<GenerateAddress> call, Throwable t) {
                Log.i("DownloadGenerateAddressFail", t.getMessage());
            }
        });
    }*/

// Returns if a given address is valid or not for a given currency.
// Connect to model.ValidateAddress and model.AddressValid.

    public interface ValidateAddressInterface {
        void onValidateAddressInterface(AddressValid addressValid);
    }

    public void setValidateAddressListener(ValidateAddressInterface setValidateAddressListener) {
        this.setValidateAddressListener = setValidateAddressListener;
    }

    public void validateAddress(String currency, String address) {
        MainBody mainBody = new MainBody();
        mainBody.setId(1);
        mainBody.setJsonrpc("2.0");
        mainBody.setMethod("validateAddress");
        Params params = new Params();
        params.setCurrency(currency);
        params.setAddress(address);
        mainBody.setParams(params);
        String sign = null;
        try {
            sign = SignChangelly.hmacDigest(new Gson().toJson(mainBody), Constants.secret_key);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ChangellyService service = RetrofitBaseApi.getClient().create(ChangellyService.class);
        Call<ValidateAddress> call = service.validateAddress("application/json", Constants.api_key, sign, mainBody);
        call.enqueue(new Callback<ValidateAddress>() {

            @Override
            public void onResponse(Call<ValidateAddress> call, Response<ValidateAddress> response) {
                // Log.i("DownloadValidateAddressSuccess", "" + response.toString());
                if (response.isSuccessful()) {
                    //loading.dismiss();
                    AddressValid addressValid;
                    addressValid = response.body().getAddressValid();
                    if (setValidateAddressListener != null)
                        setValidateAddressListener.onValidateAddressInterface(addressValid);
                } else {
                    // loading.dismiss();
                    Toast.makeText((Context) setValidateAddressListener, "Failed to fetch data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ValidateAddress> call, Throwable t) {
                Log.i("DownloadValidateAddressFail", t.getMessage());
            }
        });
    }

// Creates a new transaction, generates a pay-in address and returns Transaction object with an ID field to track a transaction status.
// Connect to model.CreateTransaction and model.TransactionInfo.

    public interface CreateTransactionInterface {
        void onCreateTransactionInterface(TransactionInfo getResult);
    }

    public void setCreateTransactionListener(CreateTransactionInterface setCreateTransactionListener) {
        this.setCreateTransactionListener = setCreateTransactionListener;
    }

    public void createTransaction(String from, String to, String address, String amount) {
        MainBody mainBody = new MainBody();
        mainBody.setId(1);
        mainBody.setJsonrpc("2.0");
        mainBody.setMethod("validateAddress");
        Params params = new Params();
        params.setFrom(from);
        params.setTo(to);
        params.setAddress(address);
        params.setAmount(amount);
        //params.setId(id);
        mainBody.setParams(params);
        String sign = null;
        try {
            sign = SignChangelly.hmacDigest(new Gson().toJson(mainBody), Constants.secret_key);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ChangellyService service = RetrofitBaseApi.getClient().create(ChangellyService.class);
        Call<CreateTransaction> call = service.createTransaction("application/json", Constants.api_key, sign, mainBody);
        call.enqueue(new Callback<CreateTransaction>() {

            @Override
            public void onResponse(Call<CreateTransaction> call, Response<CreateTransaction> response) {
                //Log.i("DownloadTransactionInfoSuccess", "" + response.toString());
                if (response.isSuccessful()) {
                    //loading.dismiss();
                    TransactionInfo result;
                    result = response.body().getTransactionInfo();
                    if (setCreateTransactionListener != null)
                        setCreateTransactionListener.onCreateTransactionInterface(result);
                } else {
                    // loading.dismiss();
                    Toast.makeText((Context) setCreateTransactionListener, "Failed to fetch data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<CreateTransaction> call, Throwable t) {
                Log.i("DownloadCreateTransactionFail", t.getMessage());
            }
        });
    }

// Returns an array of all transactions or a filtered list of transactions.
// Connect to model.Transaction and model.ListTransaction.

    public interface GetTransactionInterface {
        void onGetTransactionInterface(List<ListTransaction> listTransactions);
    }

    public void setTransactionListener(GetTransactionInterface setTransactionListener) {
        this.setTransactionListener = setTransactionListener;
    }


    public void getTransaction() {
        MainBody mainBody = new MainBody();
        mainBody.setId(1);
        mainBody.setJsonrpc("2.0");
        mainBody.setMethod("getTransaction");
        Params params = new Params();
        mainBody.setParams(params);
        String sign = null;
        try {
            sign = SignChangelly.hmacDigest(new Gson().toJson(mainBody), Constants.secret_key);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ChangellyService service = RetrofitBaseApi.getClient().create(ChangellyService.class);
        Call<Transaction> call = service.getTransaction("application/json", Constants.api_key, sign, mainBody);
        call.enqueue(new Callback<Transaction>() {

            @Override
            public void onResponse(Call<Transaction> call, Response<Transaction> response) {
                // Log.i("DownloadListTransactionSuccess", "" + response.toString());
                if (response.isSuccessful()) {
                    List<ListTransaction> listTransactions;
                    listTransactions = response.body().getResult();
                    if (setTransactionListener != null)
                        setTransactionListener.onGetTransactionInterface(listTransactions);
                } else {
                    Toast.makeText((Context) setTransactionListener, "Failed to fetch data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Transaction> call, Throwable t) {
                Log.i("DownloadGetTransaction Fail", t.getMessage());
            }
        });
    }

// Returns status of a given transaction using a transaction ID provided.
// Connect to model.getStatus.

    public interface GetStatusInterface {
        void onGetStatusInterface(String result);
    }

    public void setStatusListener(GetStatusInterface setStatusListener) {
        this.setStatusListener = setStatusListener;
    }

    public void getStatus(String id) {
        MainBody mainBody = new MainBody();
        mainBody.setId(1);
        mainBody.setJsonrpc("2.0");
        mainBody.setMethod("getStatus");
        Params params = new Params();
        params.setId(id);
        mainBody.setParams(params);
        String sign = null;
        try {
            sign = SignChangelly.hmacDigest(new Gson().toJson(mainBody), Constants.secret_key);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ChangellyService service = RetrofitBaseApi.getClient().create(ChangellyService.class);
        Call<Status> call = service.getStatus("application/json", Constants.api_key, sign, mainBody);
        call.enqueue(new Callback<Status>() {

            @Override
            public void onResponse(Call<Status> call, Response<Status> response) {
                // Log.i("DownloadGetStatusSuccess", "" + response.toString());
                if (response.isSuccessful()) {
                    String result;
                    result = response.body().getResult();
                    if (setStatusListener != null)
                        setStatusListener.onGetStatusInterface(result);
                } else {
                    Toast.makeText((Context) setStatusListener, "Failed to fetch data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Status> call, Throwable t) {
                Log.i("DownloadGetStatusFail", t.getMessage());
            }
        });
    }
}