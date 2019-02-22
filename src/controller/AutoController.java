package controller;

import model.Auto;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AutoController {
    private List<Auto> ordered_autos = new ArrayList<>();

    public void addAuto(String vin_no, String brand, String model, double price ){
        Auto a = new Auto(vin_no,brand,model,price);
        ordered_autos.add(a);
        System.out.println("zamowienie przyjete "+a);
    }
    public void getAllAutos(){
        ordered_autos.forEach(auto -> System.out.println(auto));
    }
    public void addEquipment(String vin, String name){
        for(int i=0; i<ordered_autos.size(); i++){
            if(ordered_autos.get(i).getVin_no().equals(vin)){
                ordered_autos.get(i).setEquipmentOrderByName(name);
            }
        }
    }
    public void deleteAutoByVin(String vin){
        for (int i = 0; i <ordered_autos.size() ; i++) {
            if(ordered_autos.get(i).getVin_no().equals(vin)){
                System.out.println("Usunieto Auto "+ordered_autos.get(i));
                ordered_autos.remove(i);
            }
        }
    }
    public void deleteEqipment(String vin, String eq_name){
        for (int i = 0; i <ordered_autos.size() ; i++) {
            if(ordered_autos.get(i).getVin_no().equals(vin)){
                System.out.println("Usunieto Auto "+ordered_autos.get(i));
                ordered_autos.get(i).setEquipmentOrderByName(eq_name);
            }
        }
    }
    public void saveDataToFIle(String fileName) throws IOException {
        FileWriter fw  = new FileWriter(fileName);
        fw.write(String.format("%15s | %10s | %10s  | %10s  | %10s | %15s \n",
                "VIN","MARKA","MODEL","CENA","WYPOSAZENIE","SUMA"));
        for(Auto a:ordered_autos) {
            fw.write(a.toString()+"\n");
        }
        fw.write(" \nDATA"+ LocalDate.now());
        fw.close();
    }

}
