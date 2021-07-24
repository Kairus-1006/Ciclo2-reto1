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
    private int codigo;
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

    Nota(String pNombre){ //debe llamarse igual que la clase
        this.nombre = pNombre; 
        this.escala100 = 0;
        this.escala5 = 0;
        this.cualitativo = "";
    }
    //alternativa diferenciando firma
    Nota(int pCodigo, boolean cargaPorCodigo){ 
        this.nombre = "Sin Nombre";
        this.codigo = pCodigo;
        this.escala100 = 0;
        this.escala5 = 0;
        this.cualitativo = "";
    }
    //otra alternativa
    Nota(int a, int opcion){
        if (opcion == 1){
            //constrya de una forma (se refiere a la escala de 100)
            this.nombre = "Sin Nombre";
            this.escala100 = a;
            this.escala5 = (double)a / 20;
        }else{
            //construya de otra forma
            this.nombre = "Sin Nombre";
            this.codigo = a;
            this.escala100 = 0;
            this.escala5 = 0;
            this.cualitativo = "";
        }
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

    Nota(String pNombre, double pEscala5){ 
        this.nombre = pNombre;
        this.escala5 = pEscala5;
        if(pEscala5 >= 2.95){
            this.cualitativo = "Apobado";
        }else{
            this.cualitativo = "Reprobado";
        }
        this.escala100 = (int)(pEscala5 * 20);
    }

   

    Nota(int pEscala100, String pNombre, double pEscala5, String pCualitativo){ 
        this.nombre = pNombre;
        this.escala100 = pEscala100;
        this.escala5 = pEscala5;
        this.cualitativo = pCualitativo;
    }

    //2b) Métodos que definen el comportamiento particular de la nota
        //alcance retorno nombre(parametros)
    public void mostrarNota(){
        System.out.println("----InfoNota----");
        System.out.println("Codigo -->"+this.codigo);
        System.out.println("Nombre -->"+this.nombre);
        System.out.println("Escala100 --> "+this.escala100);
        System.out.println("Escala5 --> "+this.escala5);
        System.out.println("Cualitativo --> "+this.cualitativo);
    }

}
