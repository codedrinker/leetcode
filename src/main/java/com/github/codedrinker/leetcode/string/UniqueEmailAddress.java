package com.github.codedrinker.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by codedrinker on 2019/5/2.
 */
public class UniqueEmailAddress {
    public int numUniqueEmails(String strings[]) {
        if (strings.length == 0) {
            return 0;
        }

        Set<String> emails = new HashSet<>();
        for (String string : strings) {
            String[] email = string.split("@");
            String[] c = email[0].split("[+]");
            String s = c[0].replace(".","") +"@"+ email[1];
            emails.add(s);
        }
        return emails.size();
    }
}
