package com.ip.parkingspots;


public class Vehicle {

    public Person owner;
    private String vehicleType;

    public Vehicle(Person owner, String vehicleType) {
        this.owner = owner;
        this.vehicleType = vehicleType;
    }

    public Person getOwner() {
        return owner;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}