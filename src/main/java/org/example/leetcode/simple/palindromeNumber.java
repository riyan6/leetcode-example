package org.example.leetcode.simple;

/**
 * @Date 2023/6/5 21:32
 * @Author riyan6
 * @Describe <a href="https://leetcode.cn/problems/palindrome-number/">回文数</a>
 */
public class palindromeNumber {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = Integer.toString(x);
        int left = 0;
        int right = str.length() - 1;
        // 左右指针，如果出现两边数据不同的情况直接返回false
        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            // 指针偏移
            right--;
            left++;
        }
        return true;
    }

}
