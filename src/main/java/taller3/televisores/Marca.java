package taller3.televisores;

public class Marca {

    private String nombre; //Marca del televisor

    Marca(String marcaIngresada){ //Ingresar la marca

        this.nombre=marcaIngresada;

    }

    public String getNombre() { //Getter para la marca del televisor
        return nombre;
    }

    public void setNombre(String marcaDelTelevisor) { //Setter para la marca del televisor
        this.nombre = marcaDelTelevisor;
    }

}

/*

           Chocolate

  ___  ___  ___  ___  ___.---------------.
.'\__\'\__\'\__\'\__\'\__,`   .  ____ ___ \
|\/ __\/ __\/ __\/ __\/ _:\   |`.  \  \___ \
 \\'\__\'\__\'\__\'\__\'\_`.__|""`. \  \___ \
  \\/ __\/ __\/ __\/ __\/ __:                \
   \\'\__\'\__\'\__\ \__\'\_;-----------------`
    \\/   \/   \/   \/   \/ :                 |
     \|______________________;________________|

 */
