public class Main {

    public static void increment(int digit) {
        digit = digit + 1;
        System.out.println("Инкрементированнное число: " + digit);
    }

    public static int incrementAndReturn(int digit) {
        digit = digit + 1;
        System.out.println("Инкреметированное и возвращенное число: " + digit);
        return digit;
    }

    public static int summ(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        increment(1);

        summ(2,1);

        int x = incrementAndReturn(10);

//        System.out.println("Инкреметированное и возвращенное число: " + x);

//        System.out.println("Сумма 3 + 5 = "  + summ(10, 5));

//        System.out.println("Сумма 3 + 5 = "  + summ(1, incrementAndReturn(1)));
//        System.out.println("Сумма 3 + 5 = "  + summ(incrementAndReturn(1), 1));

//        System.out.println("Сумма 3 + 5 = "  + summ(incrementAndReturn(1), incrementAndReturn(1)));

//        System.out.println("Передаем в качестве значения функцию: " + summ(1, incrementAndReturn(summ(incrementAndReturn(1),incrementAndReturn(1))) ));

    }
}
