package taller3.televisores;

public class Control {

    private TV tv;


   

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }



   
    
    public void turnOn(){ 
        tv.turnOn();
        
    }

    public void turnOff(){ 
        tv.turnOff();
        
    }

    public void canalUp(){ 
        tv.canalUp();
    
    }

    public void canalDown(){
            tv.canalDown();
        
    }
    
    public void volumenUp(){ 
            tv.volumenUp();

    }

    
    public void volumenDown(){ 
            tv.volumenDown();
        
    }

    public void setCanal(int canalQueLeVamosAPonerAlTelevisor){ 
            tv.setCanal(canalQueLeVamosAPonerAlTelevisor);
    
    }

    
    public void setVolumen(int volumenPorPonerleAlTeve){
            tv.setVolumen(volumenPorPonerleAlTeve);
    
    }


   

    public void enlazar(TV televisorQueLeQueremosAsignarAlControlOViceversa){ 

        this.tv=televisorQueLeQueremosAsignarAlControlOViceversa;  
        televisorQueLeQueremosAsignarAlControlOViceversa.setControl(this);  

    }

}
