public class Bike implements Vehicle  {

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę rowerem z predkoscia " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem");
    }

    @Override
    public String info() {
        return "Rower";
    }

    public void zatankuj() {
        System.out.println("Musze zjecs obiad");
    }
}
