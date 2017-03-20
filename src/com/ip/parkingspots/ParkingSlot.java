package com.ip.parkingspots;
import java.util.Vector;

public interface ParkingSlot {

    Vehicle getOccupant();
    boolean isAvailable();
    void setOccupant(Vehicle v);
    SlotType getSlotType();
    void freeSlot();

    public Vehicle getOccupant();

    public boolean isAvailable();

    public void setOccupant(Vehicle v);

    public SlotType getSlotType();
}