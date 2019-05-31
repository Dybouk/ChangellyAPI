package com.herzbrun.changellyinterface;

public class ListTransaction {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("createdAt")
    @Expose
    private int createdAt;
    @SerializedName("moneyReceived")
    @Expose
    private int moneyReceived;
    @SerializedName("moneySent")
    @Expose
    private int moneySent;
    @SerializedName("payinConfirmations")
    @Expose
    private String payinConfirmations;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("currencyFrom")
    @Expose
    private String currencyFrom;
    @SerializedName("currencyTo")
    @Expose
    private String currencyTo;
    @SerializedName("payinAddress")
    @Expose
    private String payinAddress;
    @SerializedName("payinExtraId")
    @Expose
    private Object payinExtraId;
    @SerializedName("payinHash")
    @Expose
    private Object payinHash;
    @SerializedName("amountExpectedFrom")
    @Expose
    private String amountExpectedFrom;
    @SerializedName("payoutAddress")
    @Expose
    private String payoutAddress;
    @SerializedName("payoutExtraId")
    @Expose
    private Object payoutExtraId;
    @SerializedName("payoutHash")
    @Expose
    private Object payoutHash;
    @SerializedName("refundHash")
    @Expose
    private Object refundHash;
    @SerializedName("amountFrom")
    @Expose
    private String amountFrom;
    @SerializedName("amountTo")
    @Expose
    private String amountTo;
    @SerializedName("amountExpectedTo")
    @Expose
    private String amountExpectedTo;
    @SerializedName("networkFee")
    @Expose
    private Object networkFee;
    @SerializedName("changellyFee")
    @Expose
    private String changellyFee;
    @SerializedName("apiExtraFee")
    @Expose
    private String apiExtraFee;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public int getMoneyReceived() {
        return moneyReceived;
    }

    public void setMoneyReceived(int moneyReceived) {
        this.moneyReceived = moneyReceived;
    }

    public int getMoneySent() {
        return moneySent;
    }

    public void setMoneySent(int moneySent) {
        this.moneySent = moneySent;
    }

    public String getPayinConfirmations() {
        return payinConfirmations;
    }

    public void setPayinConfirmations(String payinConfirmations) {
        this.payinConfirmations = payinConfirmations;
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

    public String getPayinAddress() {
        return payinAddress;
    }

    public void setPayinAddress(String payinAddress) {
        this.payinAddress = payinAddress;
    }

    public Object getPayinExtraId() {
        return payinExtraId;
    }

    public void setPayinExtraId(Object payinExtraId) {
        this.payinExtraId = payinExtraId;
    }

    public Object getPayinHash() {
        return payinHash;
    }

    public void setPayinHash(Object payinHash) {
        this.payinHash = payinHash;
    }

    public String getAmountExpectedFrom() {
        return amountExpectedFrom;
    }

    public void setAmountExpectedFrom(String amountExpectedFrom) {
        this.amountExpectedFrom = amountExpectedFrom;
    }

    public String getPayoutAddress() {
        return payoutAddress;
    }

    public void setPayoutAddress(String payoutAddress) {
        this.payoutAddress = payoutAddress;
    }

    public Object getPayoutExtraId() {
        return payoutExtraId;
    }

    public void setPayoutExtraId(Object payoutExtraId) {
        this.payoutExtraId = payoutExtraId;
    }

    public Object getPayoutHash() {
        return payoutHash;
    }

    public void setPayoutHash(Object payoutHash) {
        this.payoutHash = payoutHash;
    }

    public Object getRefundHash() {
        return refundHash;
    }

    public void setRefundHash(Object refundHash) {
        this.refundHash = refundHash;
    }

    public String getAmountFrom() {
        return amountFrom;
    }

    public void setAmountFrom(String amountFrom) {
        this.amountFrom = amountFrom;
    }

    public String getAmountTo() {
        return amountTo;
    }

    public void setAmountTo(String amountTo) {
        this.amountTo = amountTo;
    }

    public String getAmountExpectedTo() {
        return amountExpectedTo;
    }

    public void setAmountExpectedTo(String amountExpectedTo) {
        this.amountExpectedTo = amountExpectedTo;
    }

    public Object getNetworkFee() {
        return networkFee;
    }

    public void setNetworkFee(Object networkFee) {
        this.networkFee = networkFee;
    }

    public String getChangellyFee() {
        return changellyFee;
    }

    public void setChangellyFee(String changellyFee) {
        this.changellyFee = changellyFee;
    }

    public String getApiExtraFee() {
        return apiExtraFee;
    }

    public void setApiExtraFee(String apiExtraFee) {
        this.apiExtraFee = apiExtraFee;
    }

}