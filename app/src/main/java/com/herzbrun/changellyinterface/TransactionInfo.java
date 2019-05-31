package com.herzbrun.changellyinterface;

public class TransactionInfo {
    @SerializedName("id")
    @Expose
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @SerializedName("apiExtraFee")
    @Expose
    private String apiExtraFee;
    @SerializedName("changellyFee")
    @Expose
    private String changellyFee;
    @SerializedName("payinExtraId")
    @Expose
    private Object payinExtraId;
    @SerializedName("amountExpectedFrom")
    @Expose
    private String amountExpectedFrom;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("currencyFrom")
    @Expose
    private String currencyFrom;
    @SerializedName("currencyTo")
    @Expose
    private String currencyTo;
    @SerializedName("amountTo")
    @Expose
    private int amountTo;
    @SerializedName("payinAddress")
    @Expose
    private String payinAddress;
    @SerializedName("payoutAddress")
    @Expose
    private String payoutAddress;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("kycRequired")
    @Expose
    private boolean kycRequired;

    public String getApiExtraFee() {
        return apiExtraFee;
    }

    public void setApiExtraFee(String apiExtraFee) {
        this.apiExtraFee = apiExtraFee;
    }

    public String getChangellyFee() {
        return changellyFee;
    }

    public void setChangellyFee(String changellyFee) {
        this.changellyFee = changellyFee;
    }

    public Object getPayinExtraId() {
        return payinExtraId;
    }

    public void setPayinExtraId(Object payinExtraId) {
        this.payinExtraId = payinExtraId;
    }

    public String getAmountExpectedFrom() {
        return amountExpectedFrom;
    }

    public void setAmountExpectedFrom(String amountExpectedFrom) {
        this.amountExpectedFrom = amountExpectedFrom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public int getAmountTo() {
        return amountTo;
    }

    public void setAmountTo(int amountTo) {
        this.amountTo = amountTo;
    }

    public String getPayinAddress() {
        return payinAddress;
    }

    public void setPayinAddress(String payinAddress) {
        this.payinAddress = payinAddress;
    }

    public String getPayoutAddress() {
        return payoutAddress;
    }

    public void setPayoutAddress(String payoutAddress) {
        this.payoutAddress = payoutAddress;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isKycRequired() {
        return kycRequired;
    }

    public void setKycRequired(boolean kycRequired) {
        this.kycRequired = kycRequired;
    }

}