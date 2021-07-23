package co.edu.utp.missiontic2022.c2;

public class Nota {

    //1) Atributos --> Variables
    //2)Metodos
    //2a) Consturctores --> logica de construccion de un objeto tipo Nota
    //2b) Métodos que definen el comportamiento particular de la nota
    //2c) Getters --> Consultar a los atributos de la clase
    //2d) Setters --> Actualizar los atributos de la clase

    //1) Atributos --> Variables
    private String nombre; //esta variable solo es accesible a traves de  Nota(la entidad)
    private int escala100;
    private double escala5;
    private String cualitativo;

    //2)Metodos:

    //2a) Consturctores --> logica de construccion de un objeto tipo Nota
    Nota(){ //debe llamarse igual que la clase
        this.nombre = ""; 
        this.escala100 = 0;
        this.escala5 = 0;
        this.cualitativo = "";
    }

    Nota(int pEscala100){ 
        this.nombre = "Sin Nombre";
        this.escala100 = pEscala100;
        this.escala5 = (double)pEscala100 / 20;

        if(pEscala100 >=60){
            this.cualitativo = "Aprobado";
        }else{
            this.cualitativo = "Reprobado";
        }
        //esto es equivalente al if de arriba
        //this.cualitativo = pEscala100 >= 60 ? "Aprobado" : "Reprobado";
    }

    Nota(int pEscala5){ 
        
    }

    Nota(int pCualitativo){ 
        
    }

    Nota(int pEscala100, int pNombre, double pEscala5, String pCualitativo){ 
        
    }

}
