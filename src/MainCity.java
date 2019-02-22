import controller.CityController;

import java.io.IOException;

public class MainCity {
    public static void main(String[] args) throws IOException {
        CityController cc= new CityController();
        cc.insertIntoCity("Grudziadz",95000.,59.);
        cc.insertIntoCity("Bydgoszcz",32000.,170.5);
        cc.insertIntoCity("Torun",25000.,110.5);
        cc.selectFromCity();
        cc.selectFromCityById(1);
        cc.selectFromCityById(10);
//        cc.updateCityValueByID(1,555.);
        cc.deleteFromCityById(3);
        cc.selectFromCity();
        cc.saveCityTableData();
    }
}
