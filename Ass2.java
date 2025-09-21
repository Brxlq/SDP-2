package SDP;

public class Ass2 {

    static class Laptop {
        String brand;
        String type;

        public Laptop(String brand, String type) {
            this.brand = brand;
            this.type = type;
        }

        public void showInfo() {
            System.out.println(brand + " " + type + " Laptop created");
        }
    }

    //Factory pattern
    static class LaptopFactory {
        public static Laptop createLaptop(String brand) {
            if (brand.equalsIgnoreCase("Dell")) {
                return new Laptop("Dell", "Basic");
            } else if (brand.equalsIgnoreCase("Apple")) {
                return new Laptop("Apple", "Basic");
            } else {
                return null;
            }
        }
    }

    //Abstract Factory pattern
    static class GamingLaptopFactory {
        public static Laptop createLaptop(String brand) {
            return new Laptop(brand, "Gaming");
        }
    }

    static class BusinessLaptopFactory {
        public static Laptop createLaptop(String brand) {
            return new Laptop(brand, "Business");
        }
    }

    public static void run() {
        System.out.println("Factory Pattern");
        Laptop dell = LaptopFactory.createLaptop("Dell");
        dell.showInfo();

        Laptop apple = LaptopFactory.createLaptop("Apple");
        apple.showInfo();

        System.out.println("\nAbstract Factory Pattern");
        Laptop gamingDell = GamingLaptopFactory.createLaptop("Dell");
        gamingDell.showInfo();

        Laptop businessApple = BusinessLaptopFactory.createLaptop("Apple");
        businessApple.showInfo();
    }

    public static void main(String[] args) {
        run();
    }
}
