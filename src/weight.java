import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите вес боксера");
            int Weight = sc.nextInt();
            sc.close();
            final int First = 60;
            final int Second = 75;
            final int Therd = 90;

        switch (Weight)
        {
            case First:
                System.out.println("Легкая весовая категория");
                break;
            case Second:
                System.out.println("Средняя весовая категория");
                break;
            case Therd:
            System.out.println("Тяжелая весовая категория");
                break;
            default:
                System.out.println("Сверхтяжелая весовая категория");
                break;
        }




    }
}
