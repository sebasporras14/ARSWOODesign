package edu.escuelaing.arsw.app;

import java.io.IOException;
import java.util.LinkedList;

import junit.framework.TestCase;

/*
 * Unit test for each principal method of the program.
 * @author Sebastian Porras Rozo
 * @version 14.6.2023 
 */
public class AppTest 
    extends TestCase
{
    /*
    * Test the method which calculate the Average of the data provided in the exercise document Table 1 Column 1.(file .txt with the data was created for this test)
    * @param Path location of the file .txt with the data of table 1 column 1
    * @param list LinkedList created with the data in it 
    * @param average is the calculated average of the data in the list 
    */
    public void testAverageDataTableOneColumnOne() {
        String path = "src\\test\\java\\edu\\escuelaing\\arsw\\app\\Table1Column1.txt";
        try {
            MyLinkedList<Double> list  = reader.readLines(path);
            Double average = Stats.average(list);
            assertEquals(550.6,average);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    * Test the method which calculate the Average of the data provided in the exercise document Table 1 Column 2.(file .txt with the data was created for this test)
    * @param Path location of the file .txt with the data of table 1 column 1
    * @param list LinkedList created with the data in it 
    * @param average is the calculated average of the data in the list 
    */
    public void testAverageDataTableOneColumnTwo() {
        String path = "src\\test\\java\\edu\\escuelaing\\arsw\\app\\Table1Column2.txt";
        try {
            MyLinkedList<Double> list  = reader.readLines(path);
            Double average = Stats.average(list);
            assertEquals(60.32,average);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    * Test the method which calculate the Standard deviation of the data provided in the exercise document Table 1 Column 1.(file .txt with the data was created for this test)
    * @param Path location of the file .txt with the data of table 1 column 1
    * @param list LinkedList created with the data in it 
    * @param standarDev is the calculated standard deviation of the data in the list 
    */
    public void testStandardDeviationDataTableOneColumnOne() {
        String path = "src\\test\\java\\edu\\escuelaing\\arsw\\app\\Table1Column1.txt";
        try {
            MyLinkedList<Double> list  = reader.readLines(path);
            Double standarDev = Stats.standarDev(list);
            assertEquals(572.03,standarDev);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    * Test the method which calculate the Standard deviation of the data provided in the exercise document Table 1 Column 2.(file .txt with the data was created for this test)
    * @param Path location of the file .txt with the data of table 1 column 1
    * @param list LinkedList created with the data in it 
    * @param standarDev is the calculated standard deviation of the data in the list 
    */
    public void testStandardDeviationDataTableOneColumnTwo() {
        String path = "src\\test\\java\\edu\\escuelaing\\arsw\\app\\Table1Column2.txt";
        try {
            MyLinkedList<Double> list  = reader.readLines(path);
            Double standarDev = Stats.standarDev(list);
            assertEquals(62.26,standarDev);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    * Test the creation of a linked list using my own implementation
    * @param filePath location of the file/directory
    * @param expectedCount number of lines of code expected 
    * @param type type of count required. can be "phy" or "loc"
    */
    public void testMyLinkedList() {
        String path = "src\\test\\java\\edu\\escuelaing\\arsw\\app\\Table1Column2.txt";
        LinkedList<Double> testList = new LinkedList<Double>();
        testList.add(15.0);
        testList.add(69.9);
        testList.add(6.5);
        testList.add(22.4);
        testList.add(28.4);
        testList.add(65.9);
        testList.add(19.4);
        testList.add(198.7);
        testList.add(38.8);
        testList.add(138.2);
        try {
            MyLinkedList<Double> list  = reader.readLines(path);
            assertEquals(testList,list);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}