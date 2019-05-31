package com.herzbrun.changellyinterface;

public class AddressValue {
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("isHD")
    @Expose
    private boolean isHD;
    @SerializedName("extraId")
    @Expose
    private Object extraId;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsHD() {
        return isHD;
    }

    public void setIsHD(boolean isHD) {
        this.isHD = isHD;
    }

    public Object getExtraId() {
        return extraId;
    }

    public void setExtraId(Object extraId) {
        this.extraId = extraId;
    }

}