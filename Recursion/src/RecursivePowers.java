import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecursivePowers {

    // A simple program to calculate powers using a recursive algorithm

    private static BufferedReader In = new BufferedReader( new
            InputStreamReader(System.in));

    private static int power(int a, int b){
        if (b == 1)
            return a;
        else
            return a * power(a, b-1);
    }

    public static void main(String[] args) throws java.io.IOException{

        System.out.print("Enter a number (0 to quit): ");
        int num1 = Integer.parseInt(In.readLine());

        while(num1 != 0){
            System.out.print("Enter another number : ");
            int num2 = Integer.parseInt(In.readLine());
            System.out.print(num1 + " to the power " + num2 + " is ");
            System.out.println(power(num1, num2));

            System.out.print("Enter a number (0 to quit): ");
            num1 = Integer.parseInt(In.readLine());
        }
    }

}
