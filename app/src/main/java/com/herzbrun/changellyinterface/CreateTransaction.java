package com.herzbrun.changellyinterface;

public class CreateTransaction {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("jsonrpc")
    @Expose
    private String jsonrpc;
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("result")
    @Expose
    private TransactionInfo result;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public TransactionInfo getTransactionInfo() {
        return result;
    }

    public void setTransactionInfo(TransactionInfo result) {
        this.result = result;
    }

}