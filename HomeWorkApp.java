public class HomeWorkApp {   //Задание.
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() { //Задание 1.
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() { //Задание 2.
        int a = 20;
        int b = 10;
        int c = (a + b);
        if (a + b >= 0) {
            System.out.println("the amount is positive");
        } else {
            System.out.println("the amount is negative");
        }
        System.out.println("c = " + c);
    }

    public static void printColor() { //Задание 3.
        int value = 101 ;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value >= 0 && value <= 100) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
    }
    public static void compareNumbers() { //Задание 4.
        int a = 5;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}