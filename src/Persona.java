public class Persona {
    public void main() {
        class persona
        {
            private String nombre;
            private String apellido;
            private char sexo;
            private int edad;
            private String ciudad;

            public persona() {

            }

            public persona(String nombre, String apellido) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.sexo = sexo;
                this.edad = edad;
                this.ciudad = ciudad;
            }

            persona persona1 = new persona("Felipe", "Garcia");


            public void MayorDeEdad() {
                if (edad >= 18) {
                    System.out.println(nombre + " su edad es igual o mayor a 18");
                } else {
                    System.out.println(nombre + "su edad es menor a 18 anios");
                }

            }


        }
    }
}