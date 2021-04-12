package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(within10and20(12, 25));
        isPositiveOrNegative(-2);
        System.out.println(isNegative(0));
        printWordNTimes("повторение", 5);
        System.out.println(leapyear(1900));
    }

    public static boolean within10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void isPositiveOrNegative(int c) {
        if (c >= 0) {
            System.out.println(+c + " - this is number positive");
        } else {
            System.out.println(+c + " - this is number negative");
        }
    }

    public static boolean isNegative(int d) {
        return d < 0;
    }

    public static void printWordNTimes(String word, int times) {
        int i;
        for (i = 0; i < times; i++)
            System.out.println(word);
    }

    public static boolean leapyear (int year10){
        int bb = year10;
        int ss = year10;
        int xx = year10;
        bb %= 4;
        ss %= 100;
        xx %= 400;
        if (bb != 0 || ss == 0 && xx != 0)
            return false;
        return true;
    }
}

