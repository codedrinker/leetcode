package basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 24/09/2017.
 */
public class ListRemoveElementTest {

    public static void foreach() {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        try {
            for (String string : strings) {
                if (string == "a") {
                    strings.remove(string);
                }
            }
        } catch (Exception e) {
            System.out.println(strings);
        }
    }

    public static void foriter() {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
            if (strings.get(i) == "b") {
                strings.remove(i);
            }
            System.out.println(strings.size());
        }
        System.out.println(strings);
    }

    public static void foriterreverse() {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        for (int i = strings.size() - 1; i >= 0; i--) {
            System.out.println(strings.get(i));
            if (strings.get(i) == "b") {
                strings.remove(i);
            }
            System.out.println(strings.size());
        }
        System.out.println(strings);
    }

    public static void main(String[] args) {
        foreach();
//        foriter();
//        foriterreverse();
    }
}
