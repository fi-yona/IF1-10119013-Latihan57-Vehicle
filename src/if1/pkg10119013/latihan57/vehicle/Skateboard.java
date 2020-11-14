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


public class Skateboard extends Vehicle{
    
    private double myBoardLength;
    
    public Skateboard(){
        System.out.println("Skateboard");
    }
    
    public double getBoardLeght(){
        return myBoardLength;
    }
    
    public void setBoardLength(double boardLength){
        this.myBoardLength = boardLength;
    }
}
