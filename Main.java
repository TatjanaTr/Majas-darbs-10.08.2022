import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ievdadi skaitli x");
        int x = scan.nextInt();
        System.out.println("Ievadi skaitli y");
        int y = scan.nextInt();
        System.out.println("I zvēlies matemātisko darbību (+,-,*,/)");
        char op = scan.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Rezultāts ir " + (x + y));
                break;
            case '-':
                System.out.println("Rezultāts ir " + (x - y));
                break;
            case '*':
                System.out.println("Rezultāts ir " + (x * y));
                break;
            case '/':
                System.out.println("Rezultāts ir " + (x / y));
                break;
                default:
                    System.out.println("Izvēlēta nekorekta darbība " + op);

        }
    }
}
