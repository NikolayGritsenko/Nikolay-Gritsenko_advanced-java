package net.dunice.advancedjavaprojectacademy.tasks.block2;

import java.util.Arrays;
import java.util.Collection;

public class Block2 implements Block2Interface {

    @Override
    public <T> Collection<T> getWithoutDublicates(Collection<T> collection) {
        return collection.stream().distinct().toList();
    }

    @Override
    public <T> T[] arrayIterator(T[] array) {
        for (var x : array) {
            System.out.println(x);
        }
        return array;
    }

    @Override
    public Integer countNumber(Integer number) {
        return (int)number.toString().chars().filter(num -> num == '2').count();
    }

    @Override
    public boolean isPermutationStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = str2.toCharArray();
        Arrays.sort(arrStr1);
        Arrays.sort(arrStr2);

        return Arrays.equals(arrStr1, arrStr2);
    }

    @Override
    public String getCompressedString(String noCompressedString) {
        StringBuilder str = new StringBuilder();
        int count = 1;

        for (int i = 1; i < noCompressedString.length(); i++) {

            if (noCompressedString.charAt(i - 1) == noCompressedString.charAt(i)) {
                count++;
            } else {
                str.append(noCompressedString.charAt(i - 1));
                str.append(count);
                count = 1;
            }
            if (i + 1 == noCompressedString.length()) {
                str.append(noCompressedString.charAt(i));
                str.append(count);
            }
        }
        return (str.length() < noCompressedString.length() ? str.toString() : noCompressedString);
    }

    @Override
    public Character getFrequencyCharacter(String source) {
        char[] arrSource = source.toCharArray();
        int index = 0;
        int number = 0;

        for (int i = 0; i < arrSource.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arrSource.length; j++) {
                if (arrSource[i] == arrSource[j]) {
                    count++;
                }
            }
            if (count > number) {
                number = count;
                index = i;
            }
        }
        return arrSource[index];
    }

    @Override
    public boolean isStringValid(String givenString) {
        int count = 0;

        for (int i = 0; i < givenString.length(); i++) {
            if (givenString.charAt(i) == '(') {
                count++;
            } else if (givenString.charAt(i) == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return (count == 0);
    }

    @Override
    public String getModifyingString(String noBracketsString) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < noBracketsString.length(); i++) {
            if (i <= noBracketsString.length() / 2) {
                str.append('(');
                str.append(noBracketsString.charAt(i));
            } else {
                str.append(')');
                str.append(noBracketsString.charAt(i));
            }
        }
        return str + ")";
    }

    @Override
    public String getValidStringNoSpaces(String string) {
        StringBuilder newString = new StringBuilder();

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) != ' ' || string.charAt(i - 1) != ' ') {
                newString.append(string.charAt(i));
            }
        }
        return newString.toString();
    }

    @Override
    public int numberOfIdenticalPairs(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    result++;
                }
            }
        }
        return result;
    }
}
