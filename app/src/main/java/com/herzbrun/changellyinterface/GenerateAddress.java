package com.herzbrun.changellyinterface;

public class GenerateAddress {
    @SerializedName("jsonrpc")
    @Expose
    private String jsonrpc;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("addressValue")
    @Expose
    private AddressValue addressValue;

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

    public AddressValue getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(AddressValue addressValue) {
        this.addressValue = addressValue;
    }
}
