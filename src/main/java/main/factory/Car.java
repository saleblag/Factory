/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.factory;


public class Car {
    private String vehicleType = "car";
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color;
    private int maxFuel;
    private int currentFuel;
    private int consumption;
    
    public Car() {
        this.model = "";
        this.buildYear = 0;
        this.color = "";
        this.maxFuel = 0;
        this.currentFuel = 0;
        this.consumption = 0;
}
    public String getModel() {
        return this.model;
    
    }
    public void setModel(String customModel) {
        this.model = customModel;
    }   
    
    public int getBuildYear() {
            return this.buildYear;
    }
    
    public void setBuildYear(int customBuildYear){
        this.buildYear = customBuildYear;    
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String customColor) {
        this.color = customColor;
    }
    
    public int getMaxFuel(){
        return this.maxFuel;
    }
    
    public void setMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }
    
    public int getCurrentFuel() {
        return this.currentFuel;
    }
    
    public void setCurrentFuel(int customCurrentFuel) {
        this.currentFuel = customCurrentFuel;
    }
    
    public int getConsumption() {
        return this.consumption;
    }
    
    public void setConsumption(int customConsumption){
        this.consumption = customConsumption;
    }
    
    public String getVehicleType() {
        return this.vehicleType;
    }
    
    public void showData() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println("Stanje rezervoara je: " + this.getCurrentFuel());
        System.out.println("Kapacitet rezervoara je: " + this.getMaxFuel());
        System.out.println();
    }
    
    public void travel(int distanceTravelled) {
        //.1. definisati novi atribut 'mileage'
        //2. napraviti get i set metode
        //3. prosiriti jedan od konstruktora da moze da se setuje i mielage
        //4.kilometraza treba da se uveca
        //5.kolicina goriva da se smanji za onoliko koliko je potroseno
    }

        }


