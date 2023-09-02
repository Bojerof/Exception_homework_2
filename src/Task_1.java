import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        number();
    }
    public static void number(){
        Scanner in = new Scanner(System.in);

       try {
           System.out.println("Введите число: ");
           double num = in.nextDouble();
           System.out.println(num);
       }catch (Exception e){
           System.out.println("Невенрный ввод");
           number();
       }

    }
}