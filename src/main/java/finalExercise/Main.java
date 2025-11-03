package finalExercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company newCompany = new Company("Dario","Hard",0,10);
        newCompany.addRoom(5);
        newCompany.addRoom(10);
        newCompany.addRoom(15);
        newCompany.bookRoom(1);
        newCompany.freeRooms();
    }
}
