package org.example.lecture1.primitive;

public class CharType {
    public static void main(String[] args) {
        char c1 = '/'; // 16 bit (0; 2^16-1) - UTF-16
        char c2 = 'q';
        System.out.println(Character.isLetter(c1));

        char c = 1234;
        char c4 = '\u1234';

        System.out.println(c4);
        System.out.println("\n\t" + c4);
    }
}
