package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Auto {
    private String vin_no;
    private String brand, model;
    private double price_basic;

    private List<String> eq_name = new ArrayList<>(Arrays.asList("A", "B", "C"));
    private List<Double> eq_price = new ArrayList<>(Arrays.asList(5000., 10000., 12000.));
    private List<Integer> eq_order = new ArrayList<>(Arrays.asList(0, 0, 0));

    private List<List> equipment = new ArrayList<>(Arrays.asList(eq_name, eq_price, eq_order));

    public Auto(String vin_no, String brand, String model, double price_basic) {
        this.vin_no = vin_no;
        this.brand = brand;
        this.model = model;
        this.price_basic = price_basic;
    }

    public void setEquipmentOrderByName(String name){
        int index =eq_name.indexOf(name);
        if(eq_order.get(index)==0) {
            //dodawanie
            eq_order.set(index, 1);
        }else {
            //usuwanie
            eq_order.set(index,0);
        }
    }

    public double calcFullPrice(){
        double price_full=price_basic;
        for (int i = 0; i < eq_name.size(); i++) {
            if (eq_order.get(i) != 0) {
                price_full+=eq_price.get(i);
            }
        }
        return  price_full;
    }

    public String getOrderedEqipmentNames() {
        String eqipmentNames = "";
        for (int i = 0; i < eq_name.size(); i++) {
            if (eq_order.get(i) != 0) {
                eqipmentNames += (eq_name.get(i) + ",");
            }
        }
        return eqipmentNames;  //.substring(0,eqipmentNames.length()-2);
    }

    @Override
    public String toString() {
//        System.out.printf("%10s | %10s | %10s  | %10.2f  | %10s", "VIN","Marka","Model","Cena podstawowa","Wyposazenie");
        return String.format("%15s | %10s | %10s  | %10.2f  | %10s | %15.2f",
                vin_no, brand, model, price_basic, getOrderedEqipmentNames(), calcFullPrice());
    }

    public String getVin_no() {
        return vin_no;
    }

    public void setVin_no(String vin_no) {
        this.vin_no = vin_no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice_basic() {
        return price_basic;
    }

    public void setPrice_basic(double price_basic) {
        this.price_basic = price_basic;
    }
}
