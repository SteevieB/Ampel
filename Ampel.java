package java;
import ack.shapes.Leinwand;

/**
 * Ampel
 */
public class Ampel {
    private Rechteck gehaeuse;
    private Kreis    gruenerKreis;
    private Kreis    gelberKreis;
    private Kreis    roterKreis;

    public Ampel(){
        this(50, 50, 100);
    }

    public Ampel(int positionX, int positionY, int breite){
        this.gehaeuse       = new Rechteck(positionX, positionY, 
            breite, 250, "schwarz");
        this.gruenerKreis   = new Kreis(10, 10, 50, "gruen");
        this.gelberKreis    = new Kreis(20, 20, 50, "gelb" );
        this.roterKreis     = new Kreis(30, 30, 50, "rot"  );
    }

    public void zeichne(Leinwand leinwand){
        leinwand.zeichne(gehaeuse    );
        leinwand.zeichne(gruenerKreis);
        leinwand.zeichne(gelberKreis );
        leinwand.zeichne(roterKreis  );
    }

}
