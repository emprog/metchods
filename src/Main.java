public class Main {

    public static void increment(int digit) {
        digit = digit + 1;
        System.out.println("������������������� �����: " + digit);
    }

    public static int incrementAndReturn(int digit) {
        digit = digit + 1;
        System.out.println("����������������� � ������������ �����: " + digit);
        return digit;
    }

    public static int summ(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        increment(1);

        summ(2,1);

        int x = incrementAndReturn(10);

//        System.out.println("����������������� � ������������ �����: " + x);

//        System.out.println("����� 3 + 5 = "  + summ(10, 5));

//        System.out.println("����� 3 + 5 = "  + summ(1, incrementAndReturn(1)));
//        System.out.println("����� 3 + 5 = "  + summ(incrementAndReturn(1), 1));

//        System.out.println("����� 3 + 5 = "  + summ(incrementAndReturn(1), incrementAndReturn(1)));

//        System.out.println("�������� � �������� �������� �������: " + summ(1, incrementAndReturn(summ(incrementAndReturn(1),incrementAndReturn(1))) ));

    }
}
