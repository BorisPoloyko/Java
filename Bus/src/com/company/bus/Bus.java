package com.company.bus;

import com.company.input.ValueReader;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.Objects;

public class Bus {
    private String Name;
    private String Surname;
    private int NumberBus;
    private int NumberRoute;
    private String Model;
    private int Year;
    private double Kilometers;

    public Bus(String Name, String Surname, int NumberBus, int NumberRoute, String Model, int Year, double Kilometers){
        setName(Name);
        setSurname(Surname);
        setNumberBus(NumberBus);
        setNumberRoute(NumberRoute);
        setModel(Model);
        setYear(Year);
        setKilometers(Kilometers);
    }

    public Bus(){
        Name = " ";
        Surname = " ";
        NumberBus = 0;
        NumberRoute = 0;
        Model = " ";
        Year = 0;
        Kilometers = 0;
    }


    public String getName(){
        return Name;
    }

    public String getSurname(){
        return Surname;
    }

    public int getNumberBus(){
        return NumberBus;
    }

    public int getNumberRoute(){
        return NumberRoute;
    }

    public String getModel(){
        return Model;
    }

    public int getYear(){
        return Year;
    }

    public double getKilometers(){
        return Kilometers;
    }

    public void setName(String Name){
        if(Name.matches("[a-zA-Z]+")){
            this.Name = Name;
        }
        else{
            throw new ValueException("Only letters allowed!");
        }
    }

    public void setSurname(String Surname){
        if(Surname.matches("[a-zA-Z]+")){
            this.Surname = Surname;
        }
        else{
            throw new ValueException("Only letters allowed!");
        }
    }

    public void setNumberBus(int NumberBus){
        if  (NumberBus > 0) {
            this.NumberBus = NumberBus;
        }
        else {
            throw new ValueException("Invalid number!");
        }
    }

    public void setNumberRoute(int NumberRoute){
        this.NumberRoute = NumberRoute;
    }

    public void setModel(String Model){
        if(Model.matches("[a-zA-Z]+")){
            this.Model = Model;
        }
        else{
            throw new ValueException("Only letters allowed!");
        }
    }

    public void setYear(int Year){
        if( Year > 1950 && Year < 2020){
            this.Year = Year;
        }
        else {
            throw new ValueException("Invalid year!");
        }
    }

    public void setKilometers(double Kilometers){
        if (Kilometers >= 0){
            this.Kilometers = Kilometers;
        }
        else {
            throw new ValueException("Invalid Values!");
        }
    }

    public String toString(){
        return this.Name + "|" + this.Surname + "|" + this.NumberBus + "|" +  this.NumberRoute
                + "|" + this.Model + "|" + this.Year + "|" + this.Kilometers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return NumberBus == bus.NumberBus &&
                NumberRoute == bus.NumberRoute &&
                Year == bus.Year &&
                Double.compare(bus.Kilometers, Kilometers) == 0 &&
                Name.equals(bus.Name) &&
                Surname.equals(bus.Surname) &&
                Model.equals(bus.Model);
    }

    public static Bus[] createArray(int number){
        Bus[] result = new Bus[number];
        return result;
    }


    public static Bus[] fillArray(Bus[] Buses, int n){
        for(int i = 0; i < n; i++){
            System.out.print("Enter Name: ");
            String Name = ValueReader.stringReader();
            System.out.print("Enter Surname: ");
            String Surname = ValueReader.stringReader();
            System.out.print("Enter Number of Bus: ");
            int NumberBus = ValueReader.intReader();
            System.out.print("Enter Number of Route: ");
            int NumberRoute = ValueReader.intReader();
            System.out.print("Enter Model: ");
            String Model = ValueReader.stringReader();
            System.out.print("Enter Year: ");
            int Year = ValueReader.intReader();
            System.out.print("Enter Kilometers: ");
            double Kilometers = ValueReader.doubleReader();
            Buses[i] = new Bus(Name, Surname, NumberBus, NumberRoute, Model, Year, Kilometers);
        }
        return Buses;
    }
    public static void displayArray(Bus[] Buses, int n){
        for(int i = 0; i < n; i ++){
            System.out.println(Buses[i].toString());

        }
    }

    public static void displayByRoute(Bus[] Buses, int route, int n){
        for(int i = 0; i < n; i++){
            if(Buses[i].getNumberRoute() == route){
                System.out.println(Buses[i].toString());
            }
        }
    }

    public static void displayByAge(Bus[] Buses, int age, int n){
        for(int i = 0; i < n; i++){
            if (2020 - Buses[i].getYear() > age){
                System.out.println(Buses[i].toString());
            }
        }
    }
    public static void displayByKilometers(Bus[] Buses, double km, int n){
        for(int i = 0; i < n; i++){
            if (Double.compare(Buses[i].getKilometers(), km) > 0){
                System.out.println(Buses[i].toString());
            }
        }
    }

}
