package com.herzbrun.changellyinterface;

public class CurrenciesFull {
    @SerializedName("jsonrpc")
    @Expose
    private String jsonrpc;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("result")
    @Expose
    private List<CurrenciesFullValue> result = null;

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<CurrenciesFullValue> getResult() {
        return result;
    }

    public void setResult(List<CurrenciesFullValue> result) {
        this.result = result;
    }

}