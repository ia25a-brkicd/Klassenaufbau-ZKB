package finalExercise;

public class Room {
    private int roomNumber;
    private int capacity;
    private boolean isBooked;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public Room(int roomNumber, int capacity, boolean isBooked) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.isBooked = isBooked;
    }
}
