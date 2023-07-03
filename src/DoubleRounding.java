import java.text.DecimalFormat;

import static java.lang.Math.round;

public class DoubleRounding {
    public static void main(String[] args) {
        String formattedDouble = new DecimalFormat("#0.00").format(0.1321231);
        System.out.println(formattedDouble);

        double value = 34.766674;
        String result = String.format("%.2f",value);
        System.out.println(result);//  34,767
        System.out.println();  // Это перенос строки

//        System.out.println(Math.ceil(3.19999)); // 4.0
//        System.out.println(Math.ceil(3.09999)); // 3.0
//        System.out.println(Math.ceil(3.99999)); // 3.0
//        System.out.println(Math.floor(3.97777)); // 3.0
//        System.out.println(Math.rint(3.59999)); // 4.0
//        System.out.println(Math.rint(3.39999)); // 3.0
//        System.out.println(Math.rint(2.59999)); // 2.0
//        System.out.println(Math.round(3.59999)); // 4.0
//        System.out.println(Math.round(2.59999)); // 3.0
//        System.out.println();

        double res = 58.333333333333336;
        System.out.printf("Округлено: " + "%.2f", res);
    }

}

