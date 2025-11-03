package finalExercise;

import javax.swing.*;
import java.util.ArrayList;

public class Company {
    private String name;
    private String adress;
    private int roomCount;
    private int maxRoomCapacity;
    private ArrayList<Room> rooms;

    public Company(String name, String adress, int roomCount, int maxRoomCapacity) {
        this.name = name;
        this.adress = adress;
        this.roomCount = roomCount;
        this.maxRoomCapacity = maxRoomCapacity;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(int capacity) {
        rooms.add(new Room(rooms.size(),capacity,false));
        roomCount++;
    }

    public void searchRoom(int capacity) {
        for(Room room : rooms) {
            if (capacity <= room.getCapacity()) {
                System.out.println(room.getRoomNumber());
                return;
            }
        }
        System.out.println("Kein Raum wurde gefunden!");
    }

    public void freeRooms() {
        int counter = 0;
        for(Room room : rooms) {
            if (!room.isBooked()) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public void bookRoom(int roomNumber) {
        for(Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.setBooked(true);
            }
        }
    }
}
