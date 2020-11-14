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


public class Bicycle extends Vehicle{
    
    private int myGearCount;
    
    public Bicycle(){
        System.out.println("Bicycle");
    }
    
    public int getGearCount(){
        return myGearCount;
    }
    
    public void setGearCount(int gearCount){
        this.myGearCount = gearCount;
    }
}
