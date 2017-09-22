package basic;

/**
 * Created by codedrinker on 22/09/2017.
 */
public class PlusPlusOneAndOnePlusPlus {
    public static void main(String[] args) {
        int i = 0, j = 0;
        while (i++ < 10) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        while (++j < 10) {
            System.out.print(j);
            System.out.print(" ");
        }

        for (int m = 0; m < 20; m++) {
            System.out.println(m);
            m += 3;
        }

        "".indexOf("");
    }
}