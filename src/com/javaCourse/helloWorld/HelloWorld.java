package com.javaCourse.helloWorld;

/**
 * Java Class
 */
public class HelloWorld {
    private int b = 3; // Instance Variable
    private static int c = 4; //Class variable uses static keyword, there is exactly one copy of a class variable, regardless of how many times the class has been instantiated.
    //public static final int TEST = 14;

    /**
     * Constructor
     * inicializues  i instances se klases.
     */
    public HelloWorld() {

    }

    /**
     * Main method is the first method it's called when executing a java class.
     * Class methods can only se other class  methods (static)
     */
    public static void main(String [] arg) {
        byte byteVar = 123; // 8 bit
        short shortVar = 14124; //16 bit
        int age = 3; //32 bit
        long longVar = 1231231L; //64 bit

        float floatVar = 31.2F; //32 bit
        double doubleVar = 312312.2323;

        boolean booleanVar = false; //true or false

        char charVar = 'A'; // 16 bit Unicode characters

        String name = "Filani"; // String (String literal)

        int [] intArray = new int[3]; // Arrays are objects that hold a fixed single type object (ex. in this case integers) 0, 1, 2
        intArray[0] = 3; // an element in an array
        intArray[1] = 3;
        intArray[2] = 3;
        //intArray[3] = 3;


        System.out.println("Age : " + age + " - " + c);

        HelloWorld helloWorld = new HelloWorld();

        System.out.println("Hello \\world\\"); //escape backslash
        System.out.println("asdk jbaskd basbd ajshbd hjasb hbasb asjhdb hjasbd \n askdhksahd jasdjhgsa asd  asddjhbsajhbdjhasbdha"); //new line
        System.out.println("Hello\tWorld"); //tab
    }

    /**
     * Instance Method
     * instance methods can see all instance methods  of the class and class methods  (static)
     * @param d Method parameter
     */
    public void doSomething(int d) {
        System.out.println("Number : " + d);
    }

    //Modifiers
    /*
        Java Access Modifiers
            Default: Visible to the package, the default. No modifiers are needed.
            Private: Visible to the class only (private).
            Public: Visible to the world (public).
            Protected: Visible to the package and all subclasses (protected).
     */
    /*
        Java non access Modifiers
            The static modifier for creating class methods and variables.
            The final modifier for finalizing the implementations of classes, methods, and variables.
            The abstract modifier for creating abstract classes and methods.
            The synchronized and volatile modifiers, which are used for threads.
     */

    // JAVA Comments
    // <- Single line comment

    /*
    *  Multi line comment
    *  komentet injorohen prej kompajllerit
    */

    /**
     * Documentation comment.
     */
}
