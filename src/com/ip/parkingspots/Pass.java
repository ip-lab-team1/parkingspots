package com.ip.parkingspots;


public class Pass {

    private int price;

    private SlotType type;

    public Pass(int price, SlotType type) {
        this.price = price;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public SlotType getSlotType() {
        return type;
    }
}