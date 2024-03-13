package org.example;

public class Questao5 {
    public static void main(String[] args) {
        String entrada = "Leonardo Franco";
        char[] chars = entrada.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        String reverso = new String(chars);
        System.out.println("Original: " + entrada);
        System.out.println("Reversed: " + reverso);
    }
}
