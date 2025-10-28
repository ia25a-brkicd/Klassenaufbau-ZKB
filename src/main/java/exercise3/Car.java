package exercise3;

public class Car {
    public double fuelLevel;
    public double mileage;
    public String licensePlate;
    public double fuelConsumption;
    public int fuelCapacity;

    public Car(String licensePlate, double mileage, int fuelCapacity, double fuelConsumption, double fuelLevel) {
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
        this.licensePlate = licensePlate;
        this.fuelConsumption = fuelConsumption;
        this.fuelCapacity = fuelCapacity;
    }


    public void drive(double distance) {
        double neededFuel = fuelConsumption * distance;

        if (neededFuel > fuelLevel) {
            double possibleDistance = fuelLevel / fuelConsumption;
            mileage += possibleDistance;
            fuelLevel = 0;
        } else {
            mileage += distance;
            fuelLevel -= neededFuel;
        }

        mileage = Math.round(mileage * 100.0) / 100.0;
        fuelLevel = Math.round(fuelLevel * 100.0) / 100.0;

    }


    public void refuel(int amount) {
        fuelLevel += amount;
        if (fuelLevel > fuelCapacity) {
            fuelLevel = fuelCapacity;
        }
    }


    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", mileage=" + mileage +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}
