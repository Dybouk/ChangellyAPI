package com.herzbrun.changellyinterface;

public class Transaction {
    @SerializedName("jsonrpc")
    @Expose
    private String jsonrpc;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("result")
    @Expose
    private List<ListTransaction> result = null;

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

    public List<ListTransaction> getResult() {
        return result;
    }

    public void setResult(List<ListTransaction> result) {
        this.result = result;
    }

}