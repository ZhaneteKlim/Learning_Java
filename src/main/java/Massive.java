public class Massive {
    public static void main(String[] args) {
     //   int[] nums = {1, 1, 1, 1};
        ////////////// [0][1][2][3]
  int[] nums = new int[4]; // "создай нам 4 ячейки для типа данных инт
        for (int i = 0; i < 4; i++) {
                nums[i] = i;
            }
        nums[2] =65;
        nums[3] = 100;

        for (int e : nums) {
            System.out.println(e);
        }
        int table [][] = new int [3] [4]; // так мы создаём массив из 3х массивов
        // в каждом из которых по 4 ячейки
        table[0] = new int[4];
        table[1] = new int[4];
        table[2] = new int[40];

     //   for (int i = 0; i < 4; i++) {
     //       System.out.println("element [" + i + "]" + nums[i]); }
        }
    }

