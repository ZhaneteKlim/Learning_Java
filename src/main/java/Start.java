public class Start {
    public static void main(String[] args) {
        System.out.println("Hello World!");

 // Data types

 byte num = 100; // 8bit 128 +127
 short num1 = 131; // 16bit -32768 +32767
 int num2 = 141; // 32 bit -2147483648 + 2147483647
 long num3 = 123; // 64 bit

 float num4 = 1.1f; // 32 without f it would think that it is double
 double num5 = 1.11; // 64
 char sym = '\u2122'; // unicode 16 bit
 boolean isTrue = false; // 1 bit true/false
        System.out.println(num+num5);
        System.out.println("num = " + num + ", num2 =" + num2);
        // to print different types of variables:
        System.out.println(Integer.toString(sym)+ " " + Double.toString(num5) + "\n" + num2);





    }
}
