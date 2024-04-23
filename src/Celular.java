public class Celular {
    private String Modelo;
    private String Marca;
    private int memoria;
    private boolean radio;
    private int nroCelular;

    public Celular() {
    }

    public Celular(String marca, String modelo) {
        Marca = marca;
        Modelo = modelo;
    }
    Celular celular1= new Celular(Modelo,Marca);


    public void realizarLlamada(){
        System.out.println("Llamando...");

    }
    public void cortarLlamada(){
        System.out.println("Llamada termianda");

    }

}
