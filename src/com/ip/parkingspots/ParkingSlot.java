package com.ip.parkingspots;
import java.util.Vector;

public interface ParkingSlot {
    Vehicle getOccupant();
    boolean isAvailable();
    void setOccupant(Vehicle v);
    SlotType getSlotType();
    void freeSlot();
}