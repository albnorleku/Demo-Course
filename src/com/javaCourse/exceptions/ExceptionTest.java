package com.javaCourse.exceptions;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionTest {
    /**
     * Logger for our class (class Exceptional Test)
     */
    private final static Logger log = Logger.getLogger(ExceptionTest.class.getName());

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};

        try {
            System.out.println(arr[3]);

            int a = 0;
            int b = 2;
            //log.info("Pjestim me zero!");
            int c = b / a;
        } catch (ArrayIndexOutOfBoundsException e) {
            log.info("Error: " + e);
            System.out.println("U can't access more elements than array!");
        } catch (ArithmeticException e) {
            log.log(Level.SEVERE, "Exception: " + e);
            System.out.println("Nuk mundesh me pjestu me 0.");
        } finally {
            System.out.println("Try catch ended!");
        }
        /*catch (IndexOutOfBoundsException | ArithmeticException e) {
            e.printStackTrace();
        }*/

        System.out.println("Outside of Try Catch");

        try {
            printFromArray(200);
        } catch (IOException | CourseException e) {
            System.out.println("Exception thrown : " + e.getMessage());
        }
    }

    private static void printFromArray(int postion) throws IOException, CourseException {
        int [] arr = {1, 2, 3, 4};

        if ( postion < 0 ) {
            throw new IOException("Vlera nuk mund te jete me e vogel se zero");
        }
        /*if ( postion >= arr.length ) {
            throw new IndexOutOfBoundsException("Nuk ka aq elemente");
        }*/

        try {
            System.out.println("Printing array in position: " + arr[postion]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new CourseException("Nuk ka aq elemente"); //Chained Exception.
        }
    }
}
