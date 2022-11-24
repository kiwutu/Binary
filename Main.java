import java.util.Scanner;

import static java.lang.Long.toBinaryString;

public class Main {
    static String t2 = "";
    static long a;
    static int b;
    static double aa;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Hi();
        checkL();
        Dodoub();
    }

    public static void Hi() {
        System.out.println("Выберите 1 если вы хотите получить число в тип данных byte");
        System.out.println("Выберите 2 если вы хотите получить число в тип данных short");
        System.out.println("Выберите 3 если вы хотите получить число в тип данных int");
        System.out.println("Выберите 4 если вы хотите получить число в тип данных long");
        System.out.println("Выберите 5 если вы хотите получить число в тип данных float");
        System.out.println("Выберите 6 если вы хотите получить число в тип данных double");
        b = scanner.nextInt();
    }

    static void Doint() {
        switch (b) {
            case 1:

                IntBits();
                int z = t2.length();
                while (z > 7) {
                    t2 = t2.substring(1);
                    z--;
                }
                System.out.println(a > 0 ? "0" + t2 : t2);
                break;
            case 2:
                IntBits();
                z = t2.length();
                while (z > 15) {
                    t2 = t2.substring(1);
                    z--;
                }
                System.out.println(a > 0 ? "0" + t2 : t2);
                break;
            case 3:
                IntBits();
                System.out.println(a > 0 ? "0" + t2 : t2);
                break;
            case 4:
                String longBits = Long.toBinaryString(a);
                int z2 = longBits.length();
                if (z2 < 63) {
                    while (z2 < 63) {
                        t2 += "0";
                        z2++;
                    }
                    t2 = t2 + longBits;
                } else if (z2 >= 64) {
                    StringBuffer del1 = new StringBuffer("");
                    while (z2 >= 64) {
                        del1 = new StringBuffer(longBits);
                        del1.delete(64, 65);
                        z2--;
                    }
                    t2 = new String(del1);
                }
                System.out.println(a > 0 ? "0" + t2 : t2);
                break;
            default:
                break;
        }
    }

    public static void Dodoub() {
        switch (b) {
            case 5:
                System.out.println("Введите число");
                aa = scanner.nextFloat();

                if (aa <= -3.4 * Math.pow(10, 38) || a >= 3.4 * Math.pow(10, 38))
                    System.out.println("че-то не то, давай по новой");
                else {
                    String f = String.valueOf(aa);
                    float a1 = Float.parseFloat(f.replace(",", "."));

                    String res1 = "";
                    int floatBits = Float.floatToIntBits(a1);
                    res1 = Integer.toBinaryString(floatBits);
                    System.out.println(a1 > 0 ? "0" + res1 : res1);
                }
                break;
            case 6:
                System.out.println("Введите число");
                aa = scanner.nextDouble();

                if (a <= -1.7 * Math.pow(10, 308) || a >= 1.7 * Math.pow(10, 308))
                    System.out.println("че-то не то, давай по новой");
                else {

                    String d = String.valueOf(aa);
                    double a2 = Double.parseDouble(d.replace(",", "."));

                    String res2 = "";
                    long doubleBits = Double.doubleToLongBits(a2);
                    res2 = toBinaryString(doubleBits);
                    System.out.println(a2 > 0 ? "0" + res2 : res2);
                }
                break;
            default:
                break;
        }
    }

    public static void IntBits() {
        String intBits = Long.toBinaryString(a);
        int z1 = intBits.length();
        if (z1 < 31) {
            while (z1 < 31) {
                t2 += "0";
                z1++;
            }
            t2 = t2 + intBits;
        } else if (z1 >= 32) {
            StringBuffer del1 = new StringBuffer(" ");
            while (z1 >= 32) {
                del1 = new StringBuffer(intBits);
                del1.delete(32, 33);
                z1--;
            }
            t2 = new String(del1);
        }
    }

    public static void checkL() {
        switch (b) {
            case 1:
                System.out.println("Введите число");
                a = scanner.nextLong();
                if (a < -128 || a > 127 ) System.out.println("че-то не то, давай по новой");
                else Doint();
                break;
            case 2:
                System.out.println("Введите число");
                a = scanner.nextLong();
                if (a < -32768 || a > 32767) System.out.println("че-то не то, давай по новой");
                else IntBits();
                break;
            case 3:
                System.out.println("Введите число");
                a = scanner.nextLong();
                if (a < -128 || a > 127) System.out.println("че-то не то, давай по новой");
                else IntBits();
                break;
            case 4:
                System.out.println("Введите число");
                a = scanner.nextLong();
                long s = 9223372036854775807L;
                if (a < -s || a > s) System.out.println("чето не то, давай по новой");
                else IntBits();
                break;
            default: break;
        }
    }
}
