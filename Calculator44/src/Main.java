import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите пример.");
            String str = scanner.nextLine();
            String[] strArr = str.split(" ");
            String digitOne = strArr[0];
            String digitTwo = strArr[2];

            Arab arab = new Arab();
            Roman rim = new Roman();

            if (arab.isDigit(digitOne) && arab.isDigit(digitTwo) &&
                    (Integer.parseInt(digitOne) > -1 &&  Integer.parseInt(digitOne) < 11) &&
                    Integer.parseInt(digitTwo) > -1 &&  Integer.parseInt(digitTwo) < 11) {
                System.out.println(result(Integer.parseInt(digitOne), Integer.parseInt(digitTwo), strArr[1]));
            } else if (rim.isRoma(digitOne) != -1 && rim.isRoma(digitTwo) != -1 &&
                    rim.isRoma(digitOne) > -1 && rim.isRoma(digitOne) < 11 &&
                    rim.isRoma(digitTwo) > -1 && rim.isRoma(digitTwo) < 11) {
                rim.resultString(result(rim.isRoma(digitOne), rim.isRoma(digitTwo), strArr[1]));

            } else {
                System.out.println("не верные данные");
            }

        } catch (Exception e) {
            System.out.println("error enter");
        }
    }

    public static int result(int one, int two, String znak) {

        switch (znak) {

            case "+":
                return (one + two);
            case "-":
                return (one - two);
            case "*":
                return (one * two);
            case "/":
                return (one / two);
            default:
                return -1;

        }

    }
}
