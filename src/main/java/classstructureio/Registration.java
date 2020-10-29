package classstructureio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("adja meg a nevét:");
        String name = scanner.nextLine();


        System.out.println("adja meg e-mail címét:");
        String mail = scanner.nextLine();

        System.out.println(name);
        System.out.println(mail);
    }
}
