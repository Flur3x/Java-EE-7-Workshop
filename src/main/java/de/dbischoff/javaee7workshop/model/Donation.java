package de.dbischoff.javaee7workshop.model;

public class Donation {
    private Double amount;
    private Boolean receiptRequested;
    private String donorName;
    private Status status;
    private Account account;

    public Donation() {
        this.account = new Account();
    }

    public enum Status {
        TRANSFERRED, IN_PROCESS;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getReceiptRequested() {
        return receiptRequested;
    }

    public void setReceiptRequested(Boolean receiptRequested) {
        this.receiptRequested = receiptRequested;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
