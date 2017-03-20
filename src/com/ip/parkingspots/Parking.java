package com.ip.parkingspots;


import java.util.ArrayList;
import java.util.List;


public class Parking {
    private static Parking instance;
    public static Parking getInstance() {
        if (instance == null){
            instance = new Parking();
        }
        return instance;
    }

    private void Parking() {
        parkingSlots = new ArrayList<>();
        valets = new ArrayList<>();
    }

    private List<ParkingSlot> parkingSlots;
    private List<Valet> valets;


    public List<ParkingSlot> getAvailableSlots(SlotType s) {
        ArrayList<ParkingSlot> result = new ArrayList<>();
        for (ParkingSlot slot : parkingSlots){
            if (slot.getSlotType().equals(s) && slot.isAvailable()){
                result.add(slot);
            }
        }

        return result;
    }

    ParkingSlot parkVehicle(Vehicle vehicle){
        Pass ownerPass = vehicle.getOwner().getPass();
        SlotType passType = ownerPass.getSlotType();
        List<ParkingSlot> slots = getAvailableSlots(passType);

        if (slots.size() == 0){
            return null;
        }

        ParkingSlot targetSlot = slots.get(0);
        for (Valet valet : valets){
            if (valet.isAvailable()){
                valet.pickupVehicle(vehicle);
                valet.parkVehicle(targetSlot);
                return targetSlot;
            }
        }

        return null;
    }

    Vehicle unparkVehicle(ParkingSlot slot){
        for (Valet valet : valets){
            if (valet.isAvailable()){
                valet.unparkVehicle(slot);
                return valet.dropoffVehicle();
            }
        }

        return null;
    }
}