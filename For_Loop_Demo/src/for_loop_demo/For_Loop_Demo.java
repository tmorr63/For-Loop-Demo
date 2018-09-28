package for_loop_demo;

import java.util.Scanner;

public class For_Loop_Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a positive integer: ");
        int k = input.nextInt();
        int count, sum = 0;
        
        
        for (count = 1; count <= k;) {
            sum += k;
        }
        System.out.println("The sum of all the numbers up to " + k + "is" + sum);
    }
    
}
