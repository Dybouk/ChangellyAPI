package com.herzbrun.changellyinterface;

public class ValidateAddress {
    @SerializedName("jsonrpc")
    @Expose
    private String jsonrpc;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("result")
    @Expose
    private AddressValid addressValid;

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

    public AddressValid getAddressValid() {
        return addressValid;
    }

    public void setAddressValid(AddressValid addressValid) {
        this.addressValid = addressValid;
    }

}