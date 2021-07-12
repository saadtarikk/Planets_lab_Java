public class Runner {
    public static void main(String[] args) {
        Planets planets = new Planets("Mars", 50);
        String name = planets.getName();
        System.out.println(planets.getName());
        double size = planets.getSize();
        System.out.println(planets.getSize());
        String explode = planets.explode();
        System.out.println(explode);
    }
}



