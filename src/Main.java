public class Main {

    public static void main(String[] args) {

        Poppy papaver_orientale = new Poppy(); // створено об'єкт papaver_orientale типу Мак; створення об'єкту класу Poppy (використано конструктор без параметрів)
        papaver_orientale.say(); // вкликали метод say() для об'єкта papaver_orientale (який типу Мак)
        papaver_orientale.setName("Мак східний (Papaver orientale)"); // за допомогою сеттера setName() встановлюємо значення поля name об'єкта papaver_orientale
        System.out.println("Вид: " + papaver_orientale.getName()); // виводимо рядок з видом, для цього використовуємо геттер getName() для читання значення поля name

        Tulip tulipa_hageri = new Tulip(); // створено об'єкт з іменем tulipa_hageri типу Тюльпан; створення першого об'єкту класу Tulip (використано конструктор без параметрів)
        tulipa_hageri.setName("Тюльпан Хаджері (Tulipa hageri)"); // за допомогою сеттера setName() встановлюємо значення поля name об'єкта tulipa_hageri
        System.out.println("Вид: " + tulipa_hageri.getName()); // виводимо рядок з видом, для цього використовуємо геттер getName() для читання значення поля name

        Tulip angelique = new Tulip("Анжеліка (Angelique)", "біло-рожевий", 45); // створення другого об'єкту класу Tulip (використано конструктор з параметрами)
        double fullAngelique = angelique.getFullName(); // застосовано метод getOwner() класу Tulip до об'єкта angelique

        tulipa_hageri.say(); // вклик методу say() для об'єкту c (який типу Тюльпан)

        /**
         методу say() немає ні в класі Poppy, ні в класі Tulip
         він визначений лише в класі Flower
         але через те, що класи Poppy і Tulip наслідують клас Flower
         ми маємо можливість використовувати в об'єктах цих класів метод say()
        */
    }
}