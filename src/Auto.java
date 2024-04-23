public class Auto {
    private String color;
    private String patente;
    private int año;
    private String modelo;
    private int km;
    public Auto(String color, String patente, int año, String modelo, int km) {
        this.color = color;
        this.patente = patente;
        this.año = año;
        this.modelo = modelo;
        this.km = km;
    }
public void encender(){
    System.out.println("el auto se incendio");
    }
public void KilometrajeMayor(){
        if(km>100000 ) {
            System.out.println(" el auto tiene mas de 100000 km "+ km);
        }
        else{
            System.out.println("no supera  los 100000 km");
        }
    }
}










