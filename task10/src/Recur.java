import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

import static java.lang.Math.sqrt;

public class Recur {

    public static int recursionFunc(int n) {

        if (n<2){
            System.out.println(n);
            return 0;
        }
        System.out.println(n);
        recursionFunc(n-1);
        return 0;
    }

    public static int OutNum(int a, int b) {
        if (a == b) {
            System.out.println(a);
            return 0;
        }

        System.out.println(a);
        if (a>b){
            OutNum(a-1,b);
        }
        if (a<b){
            OutNum(a+1,b);
        }

        return 0;
    }

    public static int SumDij(int n){
        if (n%10==0){
            return n;
        }
        return SumDij(n/10)+n%10;

    }

    public static int Prime(int n , int div) {

        if (div==1){
            System.out.println("Yes");
            return 0;

        }
        if (n%div==0){
            System.out.println("No");
            return 0;
        }
        Prime(n,div-1);

        return 0;
    }

    public static int Rev(int n){
        if (n%10==0){
            return 0;
        }
        System.out.print(n%10);
        Rev(n/10);
        return 0;

    }




    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //recursionFunc(s.nextInt()); //2
        ///////////////////////////////////////////////////////////////
        //OutNum(s.nextInt(),s.nextInt()); //3
        ///////////////////////////////////////////////////////////////
        //System.out.println(SumDij(s.nextInt())); //5
        //int n6 = s.nextInt();
        //Prime(n6, (int)sqrt(n6));//6
        Rev(s.nextInt()); //10

    }
}



