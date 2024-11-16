package taller3.televisores;

public class TV {

    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;

    private static int numTV=0;

    public TV(Marca marcaDelTelevisor, boolean estaEncendidoElTelevisor){

        this.marca=marcaDelTelevisor;
        this.estado=estaEncendidoElTelevisor;

        this.canal=1;
        this.volumen=1;
        this.precio=500;

        numTV++;

    }


   

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setCanal(int canal) {
        if ((canal>=1)&&(canal<=120)&&(this.estado)){
            this.canal = canal;
        } 
    }

    public int getCanal() {
        return canal;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setVolumen(int volumen) {
        if ((volumen>=0)&&(volumen<=7)&&(this.estado)){
            this.volumen = volumen;
        }
        
    }

    public int getVolumen() {
        return volumen;
    }

    public void setControl(Control control) {
        this.control = control;
        this.control.setTv(this);
    }

    public Control getControl() {
        return control;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public static int getNumTV() { 
        return numTV;
    }


   
    public void turnOn(){ 
        this.estado=true;
    }

    public void turnOff(){ 
        this.estado=false;
    }

    public boolean getEstado(){ 
        return estado;
    }


   
    public void canalUp(){
        if ((this.canal<120)&& (this.estado)){ 
            this.canal++;
        }
    }

    public void canalDown(){
        if ((this.canal>1)&& (this.estado)){ 
            this.canal--;
        }     
    }


    

    public void volumenUp(){
        if ((this.volumen<7)&& (this.estado)){ 
            this.volumen++;
        }
    }

    public void volumenDown(){
        if ((this.volumen>0)&& (this.estado)){ 
            this.volumen--;
        }     
    }
    


}
