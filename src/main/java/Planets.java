public class Planets {
    private String name;
    private double size;

//    public Planets(String name, double size){
//        this.name = name;
//        this.size = size;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public double getSize() {
//        return size;
//    }
//


    public Planets(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String explode() {
//        return "Boom!! " + name + " has exploded";
        return String.format("Boom!! %s has exploded", name);
    }
}



//public class Bear {
//    private String name;
//    private int age;
//    private double weight;
//
//    public Bear(String name, int age, double weight){
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//    }
//
//    public String getName(){
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge(){
//        return this.age;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//
//    public boolean readyToHibernate() {
//        return this.weight >= 80.00;
//    }
//}
