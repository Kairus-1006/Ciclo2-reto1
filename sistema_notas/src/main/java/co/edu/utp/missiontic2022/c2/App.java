package co.edu.utp.missiontic2022.c2;

/**
 * Sistema de Notas
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* //Probar nuestra clase Nota
        Nota nota1 = new Nota("Taller 2");

        //Observar el contenido
        //System.out.println(nota1);

        //Utilizar un comportamiento de la clase -> Mostrar sus atributos fomateados en consola
        nota1.mostrarNota();

        //Construir segunda nota aprovechndo otro comportamiento de construccion -> requerimiento
        int calificacionEscala100 = 69;
        Nota nota2 = new Nota(calificacionEscala100);
        nota2.mostrarNota();

        //ejemplo constructor con codigo
        Nota notaEjemploFirmas = new Nota(34688, true);
        notaEjemploFirmas.mostrarNota();

        //ejemplo constructor con codigo utilizando opcion
        Nota notaEmpleandoOpcion = new Nota(45678, 0);
        notaEmpleandoOpcion.mostrarNota();

        //ejemplo constructor nota en escala de100  utilizando opcion
        Nota notaOpcion100 = new Nota(44, 1);
        notaOpcion100.mostrarNota();


        //Ejercicio propusto de otro estudiante
        double calificacionPedro = 4;
        Nota notaPedro = new Nota("Taller Pedro", calificacionPedro);
        notaPedro.mostrarNota();
        
        System.out.println("Solomante el contenido del atributo escala100: "+notaPedro.getEscala100());

        //Actualizar el nombre de una nota que ya esta creada
        notaOpcion100.setNombre("Nombre Actualizado Nota100");
        notaOpcion100.mostrarNota(); 
        */

        //probar la clase materia(orientado al requerimiento)
        Materia materia = new Materia("FundamentosProg",40,50,39,76,96);
        materia.mostrarMateria();

        //utilizr el comportamiento de materia para alcanzar el objetivo
        materia.obtenerPeorNota();
        materia.calcularPromedioAjustado();
        materia.reportarPromedioAjustado(); 

    }
}
