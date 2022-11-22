public class HouseProject {
    //Объявление переменных
    private NumberStoreys numberStoreys;
    private MaterialHouse materialHouse;
    private Boolean basement;
    private  RoofSlope roofSlope;
    private String roofMaterial;

    //Конструктор без параметров, задаёт значения по умолчанию
    public HouseProject() {
        numberStoreys = numberStoreys.ONE;
        materialHouse = materialHouse.WOOD;
        basement = false;
        roofSlope = roofSlope.ONE;
        roofMaterial = "Corrugated board";
    }

    //Конструктор с параметрами, пользователь сам задаёт значения
    public HouseProject(NumberStoreys numberStoreys, MaterialHouse materialHouse, Boolean basement, RoofSlope roofSlope, String roofMaterial) {
        this.numberStoreys = numberStoreys;
        this.materialHouse = materialHouse;
        this.basement = basement;
        this.roofSlope = roofSlope;
        this.roofMaterial = roofMaterial;
    }

    //Методы для изменения полей
    public void changeBasement(Boolean availability) {
        basement = availability;
    }
    public void changeNumberStoreys(NumberStoreys num) {
        numberStoreys = num;
    }
    public void changeMaterialHouse(MaterialHouse material) {
        materialHouse = material;
    }
    public void changeRoofSlope(RoofSlope slope) {
        roofSlope = slope;
    }
    public void  changeRoofMaterial(String material) {
        roofMaterial = material;
    }
}
