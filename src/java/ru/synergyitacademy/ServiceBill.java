package ru.synergyitacademy;

public class ServiceBill extends Bill {
    private String service;

    public ServiceBill() {
        this("");
        this.account = "413465";
        this.money = 10000;
    }

    public ServiceBill(String serviceName) {
        super("");
        this.service = serviceName;
    }

}
