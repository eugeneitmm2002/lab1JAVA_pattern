// Лаб.раб №1. Автор: Шуин Евгений, 382008-3. Комментарии были добавлены для детального пояснения.
public class Main {
    public static void main(String[] args) {
        //Создан класс проекта дома. Инициализирован конструктором без параметров
        HouseProject house = new HouseProject();

        //Добавление подвала дому
        house.changeBasement(true);
        //Изменено количество этажей у дома на 2
        house.changeNumberStoreys(NumberStoreys.TWO);

        //Создан класс проекта дома. Инициализирован конструктором с параметрами
        HouseProject threeStoreyHouse = new HouseProject(NumberStoreys.THREE, MaterialHouse.STONE, true, RoofSlope.TWO, "Corrugated board");

        //Изменен материал из которого строится дом на дерево
        threeStoreyHouse.changeMaterialHouse(MaterialHouse.WOOD);
        //Изменена скатность крыши с 2 на 4
        threeStoreyHouse.changeRoofSlope(RoofSlope.FOUR);
    }
}