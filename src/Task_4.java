import java.util.Objects;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        word();
    }
    public static void word(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите что-нибудь: ");
        String element = in.nextLine();
        if (element == "" || element == " "){
            System.out.println("Строка не должна быть пустой!");;
           word();
        }
        else System.out.println(element);
    }
}

