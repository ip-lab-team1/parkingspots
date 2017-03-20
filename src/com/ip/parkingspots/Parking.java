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
            if (slot.getSlotType().equals(s)){
                result.add(slot);
            }
        }

        return result;
    }

    ParkingSlot parkCar()
}