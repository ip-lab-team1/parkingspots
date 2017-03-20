package com.ip.parkingspots;


public class SlotType {

    private Integer price;
    private String typeId;

    public Integer getPrice() {
        return price;
    }

    public String getTypeId() {
        return typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SlotType)) return false;

        SlotType slotType = (SlotType) o;

        if (!getPrice().equals(slotType.getPrice())) return false;
        return getTypeId().equals(slotType.getTypeId());
    }

    @Override
    public int hashCode() {
        int result = getPrice().hashCode();
        result = 31 * result + getTypeId().hashCode();
        return result;
    }
}