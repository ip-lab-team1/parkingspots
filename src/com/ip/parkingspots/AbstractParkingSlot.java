package com.ip.parkingspots;



import java.util.UUID;

public abstract class AbstractParkingSlot implements ParkingSlot {

  public Vehicle occupant;

  public boolean availability;

  public UUID id;

  public SlotType slotType;

  @Override
  public Vehicle getOccupant() {
    return this.occupant;
  }

  @Override
  public boolean isAvailable() {
    return this.availability;
  }

  @Override
  public void setOccupant(Vehicle vehicle) {
    this.occupant = vehicle;
  }

  @Override
  public SlotType getSlotType() {
    return this.slotType;
  }
}