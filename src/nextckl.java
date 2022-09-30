import java.util.Scanner;

public class nextckl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        do {
            System.out.println(start++);
        }
        while (start<=50);
    }
}
