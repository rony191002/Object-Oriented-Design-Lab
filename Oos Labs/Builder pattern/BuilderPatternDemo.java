public class BuilderPatternDemo {
    public static void main(String[] args) {
        Car defaultCar = new CarBuilder().build();
        System.out.println("\nDefaultCar Configuration: " + defaultCar);

        Car customCar = new CarBuilder()
        .setModelName("Tesla Model 3")
        .setEngineType("Electric")
        .setColor("Midnight Silver")
        .setTransmission("Automatic")
        .setSunroof(true)
        .setInfotainmentSystem(true)
        .build();
   
    System.out.println("\nCustomized Car Configuration:\n" + customCar);
    }
}
