public class Arab {

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

    public boolean isDigit ( String str){
        try {
            Integer.parseInt(str);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
