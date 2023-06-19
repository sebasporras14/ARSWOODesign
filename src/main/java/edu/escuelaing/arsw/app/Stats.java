package edu.escuelaing.arsw.app;

public class Stats{   
    
    /* 
     * Calculate the average of all the numbers in a LinkedList
     * @param numbers LinkedList
     * @return the average
     */
    public static Double average(MyLinkedList<Double> numbers){
        Double acum = 0.0;
        /*for (int i=0; i < numbers.size(); i++){
            acum = acum + numbers.get(i);
        }*/
        java.util.Iterator<Double> iterator = numbers.iterator();
        while(iterator.hasNext()){
            Double elemento = iterator.next();
            acum += elemento;
        }
        
         return Math.round(acum/numbers.size()*100.0)/100.0;

    }
    /* 
     * Calculate the standard deviation of all the numbers in a LinkedList
     * @param numbers LinkedList
     * @return the Standard Deviation
     */
    public static Double standarDev(MyLinkedList<Double> numbers){
        Double average = average(numbers) ;
        Double sum = 0.0;
        /*for (int i = 0; i < numbers.size(); i++){
            Double elemento = numbers.get(i);
            Double var = Math.pow((elemento - average), 2);
            sum += var;
        }
        */
        java.util.Iterator<Double> iterator = numbers.iterator();
        while(iterator.hasNext()){
            Double elemento = iterator.next();
            Double var = Math.pow((elemento - average), 2);
            sum += var;
        }
        
        Double variance = Math.sqrt(sum/(numbers.size() -1));
        return Math.round(variance*100.0)/100.0;

    }
}
