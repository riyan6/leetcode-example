package org.example.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 罗马数字转整形
 * @author riyan6
 * @since 2023/6/8 19:57 星期四
 */
public class RomanToInt {

    public static void main(String[] args) {
        String s = "MCMXCIVLVIIIXLV";
        int res = romanToInt(s);
        System.out.println(res);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int len = s.length();
        Map<String, Integer> groupMap = new HashMap<>();
        groupMap.put("IV", 4);
        groupMap.put("IX", 9);
        groupMap.put("XL", 40);
        groupMap.put("XC", 90);
        groupMap.put("CD", 400);
        groupMap.put("CM", 900);

        Map<Character, Integer> scoreMap = new HashMap<>();
        scoreMap.put('I', 1);
        scoreMap.put('V', 5);
        scoreMap.put('X', 10);
        scoreMap.put('L', 50);
        scoreMap.put('C', 100);
        scoreMap.put('D', 500);
        scoreMap.put('M', 1000);
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                result += scoreMap.get(s.charAt(i));
                continue;
            }
            String groupStr = s.substring(i, i + 2);
            if (groupMap.containsKey(groupStr)) {
                result += groupMap.get(groupStr);
                i ++;
            } else {
                result += scoreMap.get(s.charAt(i));
            }
        }
        return result;
    }

}
