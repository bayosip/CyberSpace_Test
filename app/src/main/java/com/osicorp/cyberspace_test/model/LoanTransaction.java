package com.osicorp.cyberspace_test.model;

import com.google.gson.annotations.SerializedName;

public class LoanTransaction {

    @SerializedName("id")
    String id;

    @SerializedName("createdAt")
    String createdAt;

    @SerializedName("name")
    String name;

    @SerializedName("avatar")
    String avatar;

    @SerializedName("amount")
    String amount;

    @SerializedName("isLoanApproved")
    Boolean isLoanApproved;

    public LoanTransaction(String id, String createdAt, String name, String avatar,
                           String amount, Boolean isLoanApproved) {
        this.id = id;
        this.createdAt = createdAt;
        this.name = name;
        this.avatar = avatar;
        this.amount = amount;
        this.isLoanApproved = isLoanApproved;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Boolean getLoanApproved() {
        return isLoanApproved;
    }

    public void setLoanApproved(Boolean loanApproved) {
        isLoanApproved = loanApproved;
    }
}
