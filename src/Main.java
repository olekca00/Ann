public class Main {
    public static void main(String[] args) {

        /* 6. створити два об'єкти класу
           7. для першого застосувати конструктор без параметрів, поля заповнити за допомогою сеттерів
           8. для другого застосувати конструктор з параметрами
           9. вивести інформацію про два об'єкти (скористатись методом класу для цього)
        */

        Building building1 = new Building(); // створення першого об'єкту класу (використано конструктор без параметрів)
        building1.setApartmentCount(8); // використано сеттер для зміни поля ApartmentCount (кількість квартир)
        building1.setFloorCount(4); // використано сеттер для зміни поля FloorCount (кількість поверхів)
        building1.setAddress("Зелена 57"); // використано сеттер для зміни поля Address (адреса)
        double FloorAddressBuilding1 = building1.getFloorAddress(); // використано метод getFloorAddress() класу Building до об'єкта building1

        Building building2 = new Building("Анна", "Бардиш", 15); // створення другого об'єкту класу (використано конструктор з параметрами)
        double FloorAddressBuilding2 = building2.getOwner(); // застосовано метод getOwner() класу Building до об'єкта building2

    }
}