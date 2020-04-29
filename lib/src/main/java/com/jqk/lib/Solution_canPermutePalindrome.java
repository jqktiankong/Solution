package com.jqk.lib;

/**
 * 回文排列
 *
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 *
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 *
 * 回文串不一定是字典当中的单词。
 *
 * 思路：将字符跟后面的字符比较，发现相同的字符num+1，然后跳过后边相同的字符，继续比较
 * 最后 num == 字符长度 / 2 或 num - 1 == 字符长度 / 2
 */
public class Solution_canPermutePalindrome {

    public static void main(String[] args) {
        System.out.println("结果 = " + canPermutePalindrome("a"));
    }

    public static boolean canPermutePalindrome(String s) {
        int num = 0;
        int length = s.length();

        int nums[] = new int[length / 2];

        int numsSub = -1;

        for (int a = 0; a < length / 2; a++)
        {
            nums[a] = -1;
        }

        for (int i = 0; i < length; i++)
        {
            char a = s.charAt(i);

            boolean mbool = false;
            for (int k = 0; k < length / 2; k++)
            {
                System.out.println("nums[k]  = " + nums[k]);

                if (nums[k] == i)
                {
                    mbool = true;
                }
            }
            if (mbool)
            {
                System.out.println("continue i = " + i);
                continue;
            }
            for (int j = i + 1; j < length; j++)
            {

                if (a == s.charAt(j))
                {
                    numsSub++;
                    nums[numsSub] = j;

                    num++;
                    System.out.println("num = " + num);
                    System.out.println("j = = " + j);
                    break;
                }
            }
        }

        boolean b = false;

        System.out.println("length / 2 = " + length / 2);

        if (length == 1)
        {
            b = true;
        }
        else if (length == 2)
        {
            if (num == length / 2)
            {
                b = true;
            }
        }
        else
        {
            if (num == length / 2 || num - 1 == length / 2)
            {
                b = true;
            }
        }

        return b;
    }
}
