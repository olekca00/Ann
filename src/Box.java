/*
опис класу завжди зьерігається в окремому файлі
клас умовно ділиться на кілька частин
    1. спочатку йде перелік полів класу
        властивості об'єктів конкретного класу
    2. конструктори
        спеціальні методи, за допомогою яких створюються об'єкти конкреного класу
        їх молже бути 1 або декілька
        між відрізняються набором параметрів
    2. геттери та сеттери
        2.1 сеттери - методи для встановлення значень полів
        2.2 геттери - методі для читання значень полів
    3. інші методи, які визначають поведінку об'єктів класу
 */

public class Box {
    // поля класу
    private double length;
    private double width;
    private double height;

    public Box() { }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return length * width * height;
    }
}