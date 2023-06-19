package edu.escuelaing.arsw.app;
import java.io.IOException;

/**
 *
 * @author sebas 
* execute the program according the parameters given 
* @param args
* @throws IOException
*/
public class OODesign {
    public static void main(String[] args) throws IOException {
        MyLinkedList<Double> list  = reader.readLines(args[0]);
        System.out.println("el promedio de los datos es: "+ Stats.average(list) + " y la desviacion estandar es: "+ Stats.standarDev(list));
    }
}
