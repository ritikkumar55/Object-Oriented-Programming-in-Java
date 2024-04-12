interface Car {
    public void price();
}

class ElectricCar implements Car{
    public void price() {
        System.out.println("Electric Car Price");
    }
}

class DieselCar implements Car{
    public void price(){
        System.out.println("Diesel Car Price");
    }
}

public interface interfacedemo {
    public static void main(String[] args) {
        Car Tesla = new ElectricCar();
        Car Suzuki = new DieselCar();
        Tesla.price();
        Suzuki.price();

    }
    }

