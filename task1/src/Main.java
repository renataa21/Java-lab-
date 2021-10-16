import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
//1 2 3 4 5 6 7 8 9 10
public class Main {

    static int Factorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Factorial(5)+" factorial");
        int Sum = 0;
        Scanner s = new Scanner(System.in);
        int[]a= new int[10];
        int[]a2= new int[10];
        int i=0;
        int l =0;
        System.out.println("Введите элементы массива");
        while ( i < 10) {
            a[i]=s.nextInt();
            Sum=Sum+a[i];
            i++;
        }
        System.out.println("Сумма ="+Sum+ " while");
        Sum = 0;
        do{

            Sum=Sum+a[l];
            l++;
        }while (l<10);
        System.out.println("Сумма ="+Sum+ " do-while");
        Sum=0;
        for(int j = 0;j<10;j++) {

            Sum=Sum+a[j];
        }
        System.out.println("Сумма ="+Sum+ " for");
        ///////////////////////////////////////////////
        for(int k = 0; k <  a2.length; k++) {
            a2[k] = (int) Math.floor(Math.random() * 10);

        }
        System.out.println(Arrays.toString(a2));
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));
        ////////////////////////////////////////
        for (int k = 1; k < 11; k++) {
            System.out.print(1./k+" ");
        }
        }
        ///////////////////////////////////////////


}
