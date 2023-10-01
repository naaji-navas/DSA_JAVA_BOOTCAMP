//ArrayIntro.java

package arrrys;

public class ArrayIntro {
    public static void main(String[] args){
        // syntax for creating an array
        int[] marks = new int[5];
        // syntax for initializing an array
        // data_type[] variable_name = new data_type[size];
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 80;
        marks[3] = 70;
        marks[4] = 60;
        // syntax for printing an array
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        // all the types in the array are of the same type
        // syntax for printing an array using for loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
        int[] age; // declaration
        age = new int[10]; // memory allocation in the heap memory
        // heap memory is the memory that is allocated at the run time of the program
        // stack memory is the memory that is allocated at the compile time of the program
        // syntax for printing an array using for each loop
        for (int element: marks) {
            System.out.println(element);
        }
    }
}
