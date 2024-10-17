package math_class;

/**
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Math.html
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //using math class which is a static class
        //static things (methods and variables) belong to the class rather than
        //objects (instance of the class)
        //we don't need to create an object since Math class is static
        // ClassName.methodName(); e.g. Math.random()
        // ClassName.staticVariableName(); e.g. Math.PI

        double myPI = Math.PI;


        // abs
        int num1 = -2;
        int absValue = Math.abs(num1);
        System.out.println(absValue);

        // pow
        double num2 = Math.pow(3,5);
        System.out.println((num2)); //cast to int if you wan that

        // sqrt
        double num3 = Math.sqrt(80);
        System.out.println(num3);
        System.out.println(Math.pow(num3,2)); //round off error

        //create a random number in the range [0,1)
        double random1 = Math.random();
        System.out.println(random1);

        //create a random number in the range [0, n)
        //example: [0,6)
        double random2 = (int)(Math.random()*6);
        //in genral just multiply by n

        // create a random number in the range [0,n]
        // example [0,6)
        double random3 = (int)(Math.random()*7);


        //For Homework

        // create a random number in the range [m,n]


        //using the Random Class
        //This is not static so we have to create a Random object

        //create a Random object
        random randObj = new random;

        //get int with and without bound
        int randInt = randObj.nextInt();
        System.out.println(randInt);

        //with bound
        int randIntSmaller = randObj.nextInt(100);
        System.out.println(randIntSmaller);

        // get double
        double randDouble = randObj.nextDouble();
        System.out.println(randDouble);

        double randDoubleTwo = randObj.nextDouble(50,100);
        System.out.println(randDoubleTwo);





    }
}
