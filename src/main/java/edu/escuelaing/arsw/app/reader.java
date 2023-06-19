package edu.escuelaing.arsw.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class reader {

    /* 
     * read a file and add each number in the linked list 
     * @param path file's location
     * @return the linked list with numbers added
     * @throws IOException
     */
    public static MyLinkedList<Double> readLines(String path) throws IOException{
        MyLinkedList<Double> myList = new MyLinkedList<Double>();
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line = reader.readLine();
            while(line != null){
                myList.add(Double.valueOf(line));
                line = reader.readLine();
            }
        }
        return myList;
    }
    
}
