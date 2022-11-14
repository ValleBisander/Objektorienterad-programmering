package exercises.ex6useaclass;

import static java.lang.Math.abs;

import exercises.ex8hangman.HangMan.Result;

/*
 *    A class representing a rational number
 *
 *    NOTE: No IO here, this is just the logical concept.
 *
 *    Test the class by running Ex1TestRational.
 *
 * See:
 * - useaclass/
 * - UseAMap
 */

public class Rational {

 
    private int num;
    private int denum;
    
    public Rational(int x) {
        num = x;
        denum = 1;
    }
    // TODO
    public Rational(int x, int y) {
        num = x;
        denum = y;
        getSGD();
    }

    void program(){

    }


    void getSGD() {

        int r = 0;
    
        
        if (this.num > this.denum) {
            if (this.num % this.denum == 1) {
                return;
            }
            while (this.num % this.denum != 0){
                r = this.num % this.denum;
                this.num = this.denum;
                this.denum = r;
            }   
        }

        else if (this.num < this.denum) {
            if (this.denum % this.num == 1) {
                return;
            }
            while (this.denum % this.num != 0){
                r = this.denum % this.num;
                this.denum = this.num;
                this.num = r;
            } 
        }

    }
    public int getNum() {
        
        return num;
    }

    public int getDenom() {
    
        return denum;
    }  

}

