import java.util.Scanner;

public class ckl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int kolvo = 0;
        int sum = 0;
        do {
             num = sc.nextInt();
             kolvo++;
             sum= sum+num;
        }
        while (num !=0);
        System.out.printf("Колличество чисел - %d, \nСумма чисел - %d", kolvo,sum );

    }


}
