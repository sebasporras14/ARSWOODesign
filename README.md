# OO Design

this project we used all the knowledge in java, mvn and git to build a code able to calculate the average and standard deviation of a file that contains numbers.To make it possible, the program will read the numbers of the file and add it to a linked list implemented and will iterate node by node getting the data, acumulating and doing the respective calculations.
## Design 

### class Diagram 

this diagram shows how the classes use each other. This time OODesign is the main class which will be using the reader and stats(class made to calculate the standard deviation and the average). Reader will use the implementation of Linked List where it is going to contain nodes which cointain the data. for the implemetation of some methods required for the funcionality of LinkedList it's necessary the usage of the class LinkedListIterator wich implements the iterator inteface.

![class diagram](https://github.com/sebasporras14/ARSWloc/blob/master/images/Clases.png)


## Running the tests

we run the taste made to check the functionality of the methods done and got the result:

![test report](https://github.com/sebasporras14/ARSWloc/blob/master/images/testReport.png)

### Example running by console:

 java -cp "./target/classes" edu.escuelaing.arsw.app.OODesign "C:\Users\sebas\Documents\pruebaarsw.txt"

### tests
there are 5 tests were made to cover the principal functions of the program.

1. Test the method which calculate the Average of the data provided in the exercise document Table 1 Column 1.(file .txt with the data was created for this test)
   
2.  Test the method which calculate the Average of the data provided in the exercise document Table 1 Column 2.(file .txt with the data was created for this test)
 
3.  Test the method which calculate the Standard deviation of the data provided in the exercise document Table 1 Column 1.(file .txt with the data was created for this test)

4. Test the method which calculate the Standard deviation of the data provided in the exercise document Table 1 Column 2.(file .txt with the data was created for this test)

5. Test the creation of a linked list using the implementation done and compares it with another one creater with the LinkedList library



### coding style tests

these tests were coded using each specific method to prove that the code is doing the right action:
```
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
```
this is an example how it is coded. It will use the class reader method readlines to build a linked list with the numbes in the file provided. using assertEquals it proves the method count the same amount as was expected using the average method implemented to get this calculation.

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management
* [java](https://rometools.github.io/rome/) - Used to generate RSS Feeds


## Authors

* **Sebastian Porras**

### Date

06/19/2023 

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
