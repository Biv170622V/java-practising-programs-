package org.example;
// reverse a string without using a string inbuild functions
public class ReverseString {
    public static String reversed(String input){
        char[] chars = input.toCharArray();
        int left=0,right = chars.length - 1;
        System.out.println(chars.length);
        while(left<right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
    public static void main(String[] args){
        String name ="hello world";
        System.out.print(reversed(name));
    }
}
