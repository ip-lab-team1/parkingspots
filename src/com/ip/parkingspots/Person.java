package com.ip.parkingspots;
import java.util.List;

public class Person {

    private Pass pass;

    private String name;

    private List<Vehicle> vehicles;

    public Pass getPass() {
    return this.pass;
    }

    public Person(Pass pass, String name, List<Vehicle> vehicles) {
        this.pass = pass;
        this.name = name;
        this.vehicles = vehicles;
    }

    public void setPass(Pass pass) {

        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    
    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }
}