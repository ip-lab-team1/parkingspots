package com.ip.parkingspots;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingSlotTest {

    private AbstractParkingSlot slot1,slot2,slot3;
    private Person person1, person2, person3;
    private Parking parking;
    private Pass pass1,pass2, pass3;
    private SlotType slotType;
    private Valet valet;
    private List<Vehicle> vehicles;

    @BeforeEach
    private void setUp() {
        slot1 = new PremiumSlot();
        slot2 = new SpecialSlot();
        slot3 = new EconomicSlot();
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        parking = getInstance();
        vehicles = new ArrayList<Vehicle>();
        pass1 = new Pass();
        pass2 = new Pass();
        Vehicle vehicle = new Vehicle();
        vehicle.setOwner(person1);
        vehicles.add(vehicle);
    }

    @Test
    public void parkingSlotIsAvailable() {
        assertTrue(slot.isAvailable());
    }

    @Test
    public void doubleParking(){
        parking.
    }

    @Test
    public void priceIsOver0(){
        pass1.setPrice(-1);
        assertTrue(pass1.GetPrice() > 0);
    }

    @Test
    public void parkingSlotIsNotAvailable() {
        slot2.setOccupant(vehicles.get(0));
        assertFalse(slot2.isAvailable());
    }

}
