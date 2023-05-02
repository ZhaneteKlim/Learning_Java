import java.io.IOException;

public class counting {
    static int number = 123;

    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 3;
        int result = num1 + num2;
        System.out.println(result);
        System.out.println("result:" + result);
        System.out.println("result:" + num1 + num2);
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1 / num2;
        System.out.println(result4);
        int result5 = num1 % num2;
        System.out.println(result5);


        int num3 = 7;
        int num4 = num3--;
        System.out.println(num3);  //num3 but not num4!

        int num5 = 7;
        int num6 = ++num5;
        System.out.println(num6);

        if (num5 == num6) {
            System.out.println("result is equal");
        } else {
            System.out.println("result is not equal");
        }
        if (num5 != num6) {
            System.out.println("result is equal");
        } else {
            System.out.println("result is not equal");
        }
        if (num5 == num6 && num4 > num3) { // && means and
            System.out.println("result is equal");
        } else {
            System.out.println("result is not equal");
        }
        if (num5 == num6 || num4 > num5) { // || means if
            System.out.println("result is equal");
        } else {
            System.out.println("result is not equal");
        }
    }
}



