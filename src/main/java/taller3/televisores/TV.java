package taller3.televisores;

public class TV {

    private Marca marca;
    private int canal=1;
    private int precio=500;
    private boolean estado;
    private int volumen=1;
    private Control control;

    private static int numTV; //nro de televisores creados

    TV(Marca marcaDelTelevisor, boolean estaEncendidoElTelevisor){ //Configurar la marca y el estado del tv (encendido o apagado)

        this.marca=marcaDelTelevisor;
        this.estado=estaEncendidoElTelevisor;

    }


    //---------SETTERS Y GETTERS GENERICOS---------\\

    public void setMarca(Marca marca) { //Setter marca
        this.marca = marca;
    }

    public Marca getMarca() { //getter marca
        return marca;
    }

    public void setCanal(int canal) { //setter canal
            this.canal = canal; 
    }

    public int getCanal() { //getter canal
        return canal;
    }

    public void setPrecio(int precio) { //setter precio
        this.precio = precio;
    }

    public int getPrecio() { //getter precio
        return precio;
    }

    public void setVolumen(int volmen) { //setter volumen
            this.volumen = volmen;
        }
    }

    public int getVolumen() { //getter volumen
        return volumen;
    }

    public void setControl(Control control) { //setter del control
        this.control = control;
    }

    public Control getControl() { //getter control
        return control;
    }

    public static void setNumTV(int numTV) { //setter para el numero de televisores
        TV.numTV = numTV;
    }

    public static int getNumTV() { //getter nro de tvs
        return numTV;
    }


    //----------COMANDOS DEL ENCENDIDO Y APAGADO-----------\\

    public void turnOn(){ //Metodo para encender el televisor pasa su estado a positivo
        this.estado=true;
    }

    public void turnOff(){ //Metodo para apagar el televisor pone el estado en negativo
        this.estado=false;
    }

    public boolean getEstado(){ //getter del estado, donde sus setters son turnOn y turnOff
        return estado;
    }


    //-------CONTROLES PARA CAMBIAR DE CANAL-------\\

    public void canalUp(){
        if ((this.canal<120)&& (this.estado)){ //Subir el canal, debe ser menor a 120 y estar encendido el tv
            this.canal++;
        }
    }

    public void canalDown(){
        if ((this.canal>1)&& (this.estado)){ //Bajar el canal, debe ser mayor a 1 y estar encendido el tv
            this.canal--;
        }     
    }


    //-------CONTROLES PARA CAMBIAR EL VOLUMEN-------\\

    public void volumenUp(){
        if ((this.volumen<7)&& (this.estado)){ //Subir el volumen, debe ser menor a 7 y estar encendido el tv
            this.volumen++;
        }
    }

    public void volumenDown(){
        if ((this.volumen>0)&& (this.estado)){ //Bajar el volumen, debe ser mayor a 0 y estar encendido el tv
            this.volumen--;
        }     
    }
    


}
