package taller3.televisores;

public class Control {

    private TV tv;


    //Bwaaaa... Setter y getter para el atributo TV

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }



    //métodos: turnOn, turnOff, canalUp, canalDown, volumenUp, volumenDown,setCanal y setVolumen.
    
    public void turnOn(){ //Enciende el tv asociado al control
        if(this.tv !=null){
            tv.turnOn();
        }
    }

    public void turnOff(){ //Apagar televisor
        if(this.tv !=null){
            tv.turnOff();
        }
    }

    public void canalUp(){ //Subir canal
        if(this.tv !=null){
            tv.canalUp();
        }
    }

    public void canalDown(){ //Bajar el canal
        if(this.tv !=null){
            tv.canalDown();
        }
    }
    
    public void volumenUp(){ //Sube volumen
        if(this.tv !=null){
            tv.volumenUp();
        }
    }

    
    public void volumenDown(){ //Bajar volumen
        if(this.tv !=null){
            tv.volumenDown();
        }
    }

    public void setCanal(int canalQueLeVamosAPonerAlTelevisor){ //Colocarle un canal en particular al tv
        if(this.tv !=null){
            tv.setCanal(canalQueLeVamosAPonerAlTelevisor);
        }
    }

    
    public void setVolumen(int volumenPorPonerleAlTeve){
        if(this.tv !=null){
            tv.setVolumen(volumenPorPonerleAlTeve);
        }
    }


    //-------MÉTODO PARA ENLAZAR EL TV CON EL CONTROL-------\\

    public void enlazar(TV televisorQueLeQueremosAsignarAlControlOViceversa){ //Vea pues esta belleza ome:

        this.tv=televisorQueLeQueremosAsignarAlControlOViceversa;  //A este control le asignamos el televisor del atributo
        televisorQueLeQueremosAsignarAlControlOViceversa.setControl(this);  //Y a ese televisor le decimos que este ES su control

    }

}
