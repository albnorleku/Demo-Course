package com.javaCourse.controlFlows;

public class DemoForLoop {
    public static void main(String [] args) {
        /*
            For loop accepts 3 expressions
            Initialization  expression
            termination expression
            increment or decrement expression
         */

        /*for (int i = 1; i < 10; i++) {
            System.out.println("Number is : " + i);
        }
        System.out.println("Outside of for loop");*/

        String [] vargu = {"Hi", "test", "- string", "hello world", "2"};
        //array.length = size of array


        for(int i = 0; i < vargu.length; i++) {
            System.out.println(vargu[i]);
        }

        int position = 0;
        while(position < vargu.length) {
            position++;
            System.out.println(vargu[position]);
        }

        int [] nrArray = {2, 3, 5, 100, -19};
        int sum = sumOfArray(nrArray);

        System.out.println("Sum of array is " + sum);

        int sumWithForEach = sumOfArrayForEach(nrArray);
        System.out.println("Sum with for each: " + sumWithForEach);

        //todo homework
        // do the same with while loop and do while loop.
    }

    public static int sumOfArray(int [] nrArray) {
        int temp = 0;
        for(int c = 0; c < nrArray.length; c++) {
            temp += nrArray[c];
        }
        return temp;
    }

    /**
     * Shumen e nje array me for each.
     *
     * @param arr
     * @return
     */
    public static int sumOfArrayForEach(int [] arr) {
        int temp = 0;
        for (int val : arr) { //for each (for each iteration of elements)
            temp += val;
        }
        return temp;
    }
}
