public class Main {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder()
            .setCpu("Intel i3")
            .setRam("4GB")
            .setStorage("256GB SSD")
            .build();

        System.out.println("Basic Computer Configuration:");
        basicComputer.showSpecs();
        System.out.println();

        Computer gamingComputer = new Computer.Builder()
            .setCpu("Intel i9")
            .setRam("32GB")
            .setStorage("1TB SSD")
            .setGraphicsCard("NVIDIA RTX 4090")
            .build();

        System.out.println("Gaming Computer Configuration:");
        gamingComputer.showSpecs();
    }
}
