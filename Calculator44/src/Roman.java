public class Roman {

    public int isRoma(String number) {
        switch (number) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;


        }
        return -1;
    }


    public String returnRome(int number) {
        switch (number) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 20:
                return "XX";
            case 30:
                return "XXX";
            case 40:
                return "XL";
            case 50:
                return "L";
            case 60:
                return "LX";
            case 70:
                return "LXX";
            case 80:
                return "LXXX";
            case 90:
                return "XC";
            case 100:
                return "C";

        }
        return null;
    }

    public void resultString(int number) {

        StringBuilder str = new StringBuilder();

        int i = 100;

        while (i != 0) {
            if (number / i != 0 ) {

                if (number < 10 ) {
                    str.append(returnRome(  number % 10 ));
                    break;
                } else {
                    if ( number != 10 ) {
                        str.append(returnRome(number / i * i));
                        number %= 10;
                    }else {
                        str.append("X");
                        break;
                    }
                }
            } else {
                i /= 10;
            }
        }
        System.out.println(str);
    }
}

