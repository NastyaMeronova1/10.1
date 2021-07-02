import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        boolean go = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
            int a = scanner.nextInt();
            System.out.println("Введите второе число");
            int b = scanner.nextInt();
            int cor = a + b;
            System.out.println(cor);
            do {
                System.out.println("Do you want to continue?");
                String con = scanner.nextLine();
                int h = 4;
                if (con.equals("y")||(con.equals("Y"))){
                    go = true;
                }else {
                    h = 5;
                }
            }while(!go);
        }while(go);
    }
}