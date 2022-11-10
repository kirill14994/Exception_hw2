package ExHw2;

public class Task2 {

    public static void main(String[] args) {
        try {
            int d = 0;
            double intArray[] = {1, 2};
            double catchedRes1 = intArray[1] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Catching exception: " + e);
        }

    }
}
