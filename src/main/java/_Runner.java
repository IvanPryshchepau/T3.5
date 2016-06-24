/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _Runner {

    public static void main(String[] args) {

        try {
            System.out.println(args[0] + "  Result = " + calculate(args[0]));
            System.out.println(args[1] + "  Result = " + calculate(args[1]));
            System.out.println(args[2] + "  Result = " + calculate(args[2]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Write 3 numbers");
        }

    }

    public static double calculate(String numS) {

        double num = 0;
        try {
            num = Double.parseDouble(numS);
        } catch (NumberFormatException e) {
            System.out.println("Write number, not word");
            System.exit(0);
        }


        if (num >= 0) {
            return Math.pow(num, 2);
        } else {
            return Math.pow(num, 4);
        }
    }

}
