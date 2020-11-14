/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan57.vehicle;

/**
 *
 * @author Fiona Avila
 */


public class Vehicle {
    
    private String myBrand;
    private String myModel;
    
    public Vehicle(){
        
    }
    
    public String getBrand(){
        return myBrand;
    }
    
    public void setBrand(String brand){
        this.myBrand = brand;
    }
    
    public String getModel(){
        return myModel;
    }
    
    public void setModel(String model){
        this.myModel = model;
    }
}
