public class Tulip extends Flower {

    /**
     Клас Tulip
     він наслідує поля та методи класу Flower
     для наслідування пишемо ключове слово extends та назву класу,
     від якого будемо наслідуватись. В даному випадку Flower
    */
    private String color;
    private String name;
    private double price;
    public Tulip() { }
    public Tulip(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getFullName() {
        System.out.println("Вид: " + name + ", " + color + ", " + price + "грн");
        return 0;
    }

}
