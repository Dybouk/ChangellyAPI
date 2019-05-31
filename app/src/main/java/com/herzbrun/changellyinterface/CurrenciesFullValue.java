package com.herzbrun.changellyinterface;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrenciesFullValue {

    @SerializedName("name")
    @Expose
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("enabled")
    @Expose
    private boolean enabled;
    @SerializedName("fixRateEnabled")
    @Expose
    private boolean fixRateEnabled;
    @SerializedName("payinConfirmations")
    @Expose
    private int payinConfirmations;
    @SerializedName("extraIdName")
    @Expose
    private Object extraIdName;
    @SerializedName("addressUrl")
    @Expose
    private String addressUrl;
    @SerializedName("transactionUrl")
    @Expose
    private String transactionUrl;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("fixedTime")
    @Expose
    private int fixedTime;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isFixRateEnabled() {
        return fixRateEnabled;
    }

    public void setFixRateEnabled(boolean fixRateEnabled) {
        this.fixRateEnabled = fixRateEnabled;
    }

    public int getPayinConfirmations() {
        return payinConfirmations;
    }

    public void setPayinConfirmations(int payinConfirmations) {
        this.payinConfirmations = payinConfirmations;
    }

    public Object getExtraIdName() {
        return extraIdName;
    }

    public void setExtraIdName(Object extraIdName) {
        this.extraIdName = extraIdName;
    }

    public String getAddressUrl() {
        return addressUrl;
    }

    public void setAddressUrl(String addressUrl) {
        this.addressUrl = addressUrl;
    }

    public String getTransactionUrl() {
        return transactionUrl;
    }

    public void setTransactionUrl(String transactionUrl) {
        this.transactionUrl = transactionUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getFixedTime() {
        return fixedTime;
    }

    public void setFixedTime(int fixedTime) {
        this.fixedTime = fixedTime;
    }

}