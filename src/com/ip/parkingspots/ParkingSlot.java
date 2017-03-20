package com.ip.parkingspots;
import java.util.Vector;

public interface ParkingSlot {
    public Vehicle getOccupant();

    public boolean isAvailable();

    public void setOccupant(Vehicle v);

    public SlotType getSlotType();

}