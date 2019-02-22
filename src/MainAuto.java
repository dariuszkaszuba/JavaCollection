import controller.AutoController;

public class MainAuto {
    public static void main(String[] args) {
        AutoController ac= new AutoController();
        ac.addAuto("AV1","VW","Passat",123000);
        ac.addAuto("AV2","VW","Golf",123000);
        ac.addAuto("AV3","VW","Tiguan",123000);
        ac.addEquipment("AV1","A");
        ac.getAllAutos();
        ac.deleteAutoByVin("AV1");
        ac.getAllAutos();
    }
}
