package datastructure;


import oopmodeling.Celestialbody;

import static sun.invoke.util.ValueConversions.primitiveConversion;

public class ConversionTest {
    public static void main(String[] args) {

        primitiveConversion();

        //Polymorphism
        Planet p1 =new Planet();
        //A planet is not a star, we can not assign a object to a star object
        //star s1 =(star)new planet();
        //In the following two cases, a planet is of type celestialBodyand object
        CelestialBody p2 =new Planet();
        object p3 =new planet();
        object p4 = new Celestialbody();

        planet p5 = (Planet)p3;
        system.out.println(p5);
        system.out.println(p3);
        system.out.println(p5 == p3);

        Object[] planets = new Planet[20];
        Planet[] pls = (Planet[]) planets;

        /**
         * 1 create an array of Object of size 20
         * 2 asign each position of the array with an object of type planet
         * 3 convert the whole array explicitly to an array of planet
         */

        Object[] objArray = new Object[20];

// llenar con Planet
        for (int i = 0; i < 20; i++)
            objArray[i] = new Planet("P" + i);

// convertir explícitamente a Planet[]
        Planet[] planetArray = new Planet[20];
        for (int i = 0; i < 20; i++)
            planetArray[i] = (Planet) objArray[i];


        polymorphisMethod(p2);
        

        private static void primitiveConversion(){

        }
        int num1 =234234234;
    byte num2 = 127;
    float num3 = 324.4f;
    num1 = num2;
    system.out.println(num1);
    num2 = (byte)num1;
    system.out.println(num2);


    num1 = 1235;
    system.out.println(num1);
    //explicit conversion from an integer to a byte number
    num2 = (byte)num1;

    system.out.println("number 2 is " + num2);


    }

    private static void polymorphisMethod(CelestialBody p2) {
    }

    private static void name() {

    }
}
