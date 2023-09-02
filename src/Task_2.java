public class Task_2 {
    public static void main(String[] args) {
        try {
            int[] intArray = null;
            int d = 0;
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException ex){
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex){
            System.out.println("Массив равен нулю");
        }
    }


}
