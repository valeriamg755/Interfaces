package Sillas;

public class PostFabricacion extends Fabricacion {
    public void sitOn() {
        super.sitOn();
        System.out.println("Se puede sentar");
    }
    public void hasLegs() {
        super.hasLegs();
        System.out.println("Tiene patas");
    }
    public void color() {
        super.color();
        System.out.println("Color naranja");
    }
}
