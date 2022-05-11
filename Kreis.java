package java;

/**
 * Kreis
 */
public class Kreis {
    int positionX;
    int positionY;
    int radius;
    String farbe;

    public Kreis() {
        this(100, 100, 50, "gruen");
    }

    public Kreis(int x, int y, int r, String farbe) {
        this.positionX  = x;
        this.positionY  = y;
        this.radius     = r;
        this.farbe      = farbe;
    }

    public void verschieben(int x, int y) {
        this.positionX  += x;
        this.positionY  += y;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public void vergroessern(int z){
        this.radius *= z;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void changeColor(String c){
        this.farbe = c;
    }  
}