package com.herzbrun.changellyinterface;

public class AddressValid {
    @SerializedName("result")
    @Expose
    private boolean addressValid;

    public boolean isAddressValid() {
        return addressValid;
    }

    public void setAddressValid(boolean addressValid) {
        this.addressValid = addressValid;
    }

}
