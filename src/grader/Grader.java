/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grader1;

/**
 *
 * @author ianis_000
 */
public class Grader1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int grade = readInt("Please input your grade: ");
        if(grade >= 90)
        {
            System.out.println("You got an A");
        }
        else if(grade >= 80)
        {
            System.out.println("You got a B");
        }
        else if(grade >= 70)
        {
            System.out.println("You got a C");
        }
        else
        {
            System.out.println("You got an F");
        }
    }
    
}
