public class task8 {
    public static void main(String[] args) {

        int number = 2853858;
            int three = 0;
            int last = 0;
            int lastrem = 0;
            int chet = 0;
            int five = 0;
            int sumfive = 0;
            int seven = 0;
            int mnseven = 1;
            int fivezero = 0;


        do {
            int digit = number % 10;
            number = number / 10;
            if (digit == 3){
                three++;
            }
            if (digit % 2 ==0){
                chet++;
            }
            if (digit>5){
                five=digit;
                sumfive = sumfive + five;
            }
            if (digit>7){
                seven=digit;
                mnseven = mnseven * seven;
            }
            if (digit==0 | digit == 5){
                fivezero++;
            }



        }
        while (number>0);
        System.out.println("Троек "+ three);
        System.out.println("Четных "+ chet);
        System.out.println("Сумма больше пяти "+ sumfive);
        System.out.println("Произведение больше семи "+ mnseven);
        System.out.println("0 и 5 встречаются "+ fivezero);
        System.out.println(last);
    }


}
