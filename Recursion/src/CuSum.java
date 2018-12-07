import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CuSum {
    // a simple program to calculate a cumulative sum
    // using a recursive method call

    static BufferedReader In = new BufferedReader( new
            InputStreamReader(System.in));

    // for comparison, here is an iterative version
    public static int iterativeCuSum(int n){
        int result = 0;

        for(int i = 0; i <= n; i++)
            result += i;
        return result;
    }

    // here is the recursive version
    public static int recursiveCuSum(int n) {
        if (n == 1)
            return 1;
        else
            return (n + recursiveCuSum(n - 1));
    }



    public static void main(String args[]) throws java.io.IOException{

        System.out.print("Enter a number (0 to quit): ");
        int number = Integer.parseInt(In.readLine());

        while(number != 0){
            System.out.print("The cusum of " + number + " is ");
            System.out.println(recursiveCuSum(number));

            System.out.print("Enter a number (0 to quit): ");
            number = Integer.parseInt(In.readLine());
        }
    }
}
