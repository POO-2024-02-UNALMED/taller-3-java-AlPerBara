package taller3.televisores;

public class Marca {

    public String nombre; 

    Marca(String marcaIngresada){

        this.nombre=marcaIngresada;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String marcaDelTelevisor) { 
        this.nombre = marcaDelTelevisor;
    }

}
