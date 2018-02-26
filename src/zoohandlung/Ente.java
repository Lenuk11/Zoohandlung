
package zoohandlung;


public class Ente extends Tier implements Fliegen, Laufen, Schwimmen {
int anzahlBeine;
double spannweite;

    @Override
    public void fliegLos() {
        System.out.println("ich fliege los");
    }

    @Override
    public void lande() {
        System.out.println("ich lande");
    }

    @Override
    public void laufe() {
        System.out.println("ich laufe");
    }

    @Override
    public int getAnzahlBeine() {
                return anzahlBeine;

    }

    @Override
    public void setAnzahlBeine(int anzahl) {
                this.anzahlBeine = anzahlBeine;

    }

    @Override
    public void schwimmen() {
        System.out.println("ich laufe");
    }
    
}
