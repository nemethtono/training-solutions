package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérlek adj meg két egész számot");
        System.out.println("Első szám");
        int first = scanner.nextInt();
        System.out.println("második szám");
        int second = scanner.nextInt();

        System.out.println(first "+" second);
        System.out.println(first+second);
    }
    }
}
