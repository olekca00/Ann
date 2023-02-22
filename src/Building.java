// 1. додати клас з іменем Building
public class Building {

    // 2. поля класу: apartmentCount і floorCount типу int, address типу String
    private int apartmentCount;
    private int floorCount;
    private int age;
    private String address;
    private String firstName;
    private String lastName;

    // 4. додати 2 конструктори класу - один без параметрів, інший з трьома параметрами firstName, lastName, age
    public Building() { }

    public Building(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // 3. додати геттери і сеттери для кожного поля
    public int getApartmentCount(){
        return apartmentCount;
    }

    public void setApartmentCount(int apartmentCount){
        this.apartmentCount = apartmentCount;
    }

    public int getFloorCount(){
        return floorCount;
    }

    public void setFloorCount(int floorCount){
        this.floorCount = floorCount;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    // 5. додати метод, який буде виводити на друк адресу та кількість поверхів будинку
    public double getFloorAddress(){
        System.out.println("Адреса: " + address + "; " + "Кількість поверхів: " + floorCount + ".");
        return 0;
    }

    // 10.(додатково) додано метод, який використовує параметри з другого конструктора
    public double getOwner(){
        System.out.println(firstName + " " + lastName + "; " + "Вік: " + age + " років.");
        return 0;
    }
}
