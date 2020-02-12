package Lesson_1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.time.Year;

public class Main {
    public static void main(String[] args) {

        byte val = 90;
        short val1 = 32000;
        int val2 = 300000;
        long val3 = 3000000000L;
        float val4 = 54.78f;
        double val5 = 567.134;
        char val6 = '\u2163';
        boolean val7 = true;
        System.out.println(val);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);

        System.out.println(calculation(3.4f, 2.5f, 5.7f, 7.7f));

        System.out.println(yesOrNO(12, 17));

        plusOrMines(-10);

        System.out.println(isNegativ(15));

        printName("Андрей");

        printYear(1700);

    }

    public static float calculation(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean yesOrNO(int a, int b) {
        if ((a >= 10) && (a <= 20) && (b >= 10) && (b <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void plusOrMines(int k) {
        if (k < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean isNegativ(int p) {
        if (p >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printYear(int printYear) {

        if (printYear % 4 == 0 && printYear % 100 != 0 || printYear % 400 == 0) {
            System.out.println(printYear + " год високосный");
        } else {
            System.out.println(printYear + " год не високосный");
        }
    }
}
