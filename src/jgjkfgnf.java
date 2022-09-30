import java.util.Scanner;

public class jgjkfgnf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите площадь круга");// rrp
        double kr = sc.nextDouble();
        System.out.println("Введите площадь квадрата");// aa
        double kv = sc.nextDouble();
        sc.close();

        double a = Math.sqrt(kv);
        double d = (Math.sqrt(kr/Math.PI))*2;

        if (a > 0 && d > 0)
        {
            if (a>d)
            {
            System.out.println("Круг в квадрате");
            }
             else
            {
            System.out.println("Квадрат в круге");
            }
        }
        else
        {
            System.out.println("Невозможные значения");
        }






    }



}
