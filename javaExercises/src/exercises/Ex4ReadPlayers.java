package exercises;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Utilities to input/output player data for a command line game
 *
 *  See:
 *  - UseAConstructor
 *  - ObjectArrMeth
 *
 */
public class Ex4ReadPlayers {
    public static void main(String[] args) {
        new Ex4ReadPlayers().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        Player[] players = inputPlayers();
        outPlayers(players);
    }


    class Player {
        String name;   // A Player has a name and...
        int points = 0;   // ... and points

        Player(String name) {
            
            this.name = name;
        }
    }

    // ---------- Methods -------------------

    Player[] inputPlayers() {
        out.println("how many players?");
        int nmbrOfPLayers = sc.nextInt();

        String[] players = {};

        for (int i = 0; i <= nmbrOfPLayers; i++) {
            out.println("Name of player" + i + "?");
            
        }

        return null;   // For now
    }

    void outPlayers(Player[] players){
       out.println("Players are:\n name: " + players);
    }

}
