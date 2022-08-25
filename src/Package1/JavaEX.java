package Package1;

public class JavaEX {

    public static void ptb2(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Khong phai ptb2");
            System.out.println("x = " + ((-c) / b));
        }
        else  {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("PT vo nghiem");
            }
            if (delta == 0) {
                System.out.println("PT co nghiem x = " + (-b)/(2*a));
            }
            else {
                System.out.println("PT co nghiem 1: x1 = " + (-b - Math.sqrt(delta))/(2*a));
                System.out.println("PT co nghiem 2: x2 = " + (-b + Math.sqrt(delta))/(2*a));
            }
        }
    }

    public static void max(int a, int b, int c) {
//        if (a > b) {
//            if (b > c) {
//                System.out.println(a);
//            }
//            if (a > c) {
//                System.out.println(a);
//            }
//        }else {
//            if (a > c) {
//                System.out.println(b);
//            }
//            if (b <= c) {
//                System.out.println(c);
//            }
//        }
//

    }


}
