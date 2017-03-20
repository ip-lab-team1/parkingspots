package com.ip.parkingspots;



import java.util.UUID;

public abstract class AbstractParkingSlot implements ParkingSlot {

  public Vehicle occupant;

  public boolean availability;

  public UUID id;

    public SlotType mySlotType;

}