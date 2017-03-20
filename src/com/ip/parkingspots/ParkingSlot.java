import java.util.Vector;

public interface ParkingSlot {

    public Vector  myParking;
    public Vector  myParking;

  public Vehicle getOccupant();

  public boolean isAvailable();

  public void setOccupant(Vehicle v);

  public SlotType getSlotType();

}