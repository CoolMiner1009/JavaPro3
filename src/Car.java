public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Starting the car's electricity system...");
    }

    private void startCommand() {
        System.out.println("Starting the car's command system...");
    }

    private void startFuelSystem() {
        System.out.println("Starting the car's fuel system...");
    }
}

