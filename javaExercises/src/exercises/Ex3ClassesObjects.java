package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Using class objects to represent heroes
 *  https://en.wikipedia.org/wiki/Gladiators_(1992_UK_TV_series)
 *
 * See:
 * - ClassObjects
 * - MethodsArrObj
 */
public class Ex3ClassesObjects {

    public static void main(String[] args) {
        new Ex3ClassesObjects().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {

        Hero hero1 = new Hero();
        Hero hero2 = new Hero();

        out.println("Whats the name of hero 1 ?");
        hero1.name = sc.nextLine();
        out.println("How strong is " + hero1.name + "?");
        hero1.strength = sc.nextInt();
        sc.nextLine();
        
        out.println("Whats the name of hero 2?");
        hero2.name = sc.nextLine();
        out.println("How strong is " + hero2.name + "?");
        hero2.strength = sc.nextInt();
        

        out.println("hero1's name :" + hero1.name + "\n hero1's strenght: " + hero1.strength);
        out.println("hero2's name :" + hero2.name + "\n hero2's strenght: " + hero2.strength);
    }

    // ------ The class to use  -----------
    // A class for objects that describes a Hero
    class Hero {
        String name;
        int strength;
    }


}
