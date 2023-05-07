public class String_ {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = " World";
        String str3 = str1 + str2;
        String str4 = str2.substring(0, 3);
        String str5 = str2.toLowerCase();
        String[] str6 = {"Hello", "World", "People"};

        System.out.println(str5);
        System.out.println(1==1);
        System.out.println(str3 == str1);
        System.out.println(str1.equals(str2));
        System.out.println(str6[2]);
        System.out.println(args[0] + " " + args[1] );

    }
}
