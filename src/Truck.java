public class Truck implements Vehicle {  //skrot klawiszowy alt + enter
    @Override
    public void jazda(int speed) {
        System.out.println("Jade ciezarowka z presdkoscia " + speed);

    }

    @Override
    public void stop() {
        System.out.println("Hamuje ciezarowka");
    }

    @Override
    public String info() {
        return "Ciezarowka";
    }
}
