package co.edu.utp.missiontic2022.c2;

/**
 * Sistema de Notas
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Probar nuestra clase Nota
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
    }
}
