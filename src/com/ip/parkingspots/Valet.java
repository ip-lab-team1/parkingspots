package com.ip.parkingspots;

public class Valet {
    private Vehicle vehicleDriving;

    public Valet(){
        vehicleDriving = null;
    }

    public boolean isAvailable(){
        return vehicleDriving == null;
    }

    public void pickupVehicle(Vehicle v){
        vehicleDriving = v;
    }

    public void parkVehicle(ParkingSlot slot){
        slot.setOccupant(vehicleDriving);
        vehicleDriving = null;
    }

    public void unparkVehicle(ParkingSlot slot){
        vehicleDriving = slot.getOccupant();
        slot.setOccupant(null);
    }

    public Vehicle dropoffVehicle(){
        Vehicle result = vehicleDriving;
        vehicleDriving = null;
        return result;
    }

}