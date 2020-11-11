package Ex1;
import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
        int x,y;
        if (args.length > 0){
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        }
        else {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 2 numbers");
            x = sc.nextInt();
            y = sc.nextInt();
            sc.close();
        }
        System.out.format("Computes the GPCD (%d,%d)\n" , x,y);
        int a = x > y ? y : x;
        int max_prime_num = 1;
        for (int i = 2; i <= a; i++){
            if (x%i == 0 && y%i == 0){
                boolean notPrime = false;
                for(int q = 2; q <= i/2; ++q){
                    if(i % q == 0){
                        notPrime = true;
                        break;
                    }
                }
                if (!notPrime){
                    max_prime_num = i;
                }
            }
        }
        System.out.println("Max prime common Divider: " + max_prime_num );
    }
}