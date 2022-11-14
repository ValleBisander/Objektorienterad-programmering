package exercises.ex8hangman;

import java.util.Arrays;
import java.util.Scanner;

/*
 * This represents the secret word to guess
 */
public class Secret {

    String secretWord;

    public Secret(String secretWord){
        this.secretWord = secretWord;
    }

    public int length(){
        
        return secretWord.length();
    }
}
