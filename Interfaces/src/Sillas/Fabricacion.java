package Sillas;

abstract class Fabricacion implements Silla, Mesillas, Sofa{
    public void hasLegs(){
    }
    public void sitOn(){}
    public void tamañoTabla(){
        System.out.println("40cm");
    }
    public void color(){
        System.out.println("color naranja");
    }
    public void numCojines(){
        System.out.println("3 cojines");
    }}
