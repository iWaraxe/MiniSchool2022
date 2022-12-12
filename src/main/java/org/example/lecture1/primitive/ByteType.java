package org.example.lecture1.primitive;

public class ByteType {
    public static void main(String[] args) {
        byte b1 = (byte) 1293434; // 1 byte = 8 bit [-128 = -2^7; 127 = 2^7 - 1]
        // some text
        final byte b2 = Byte.MAX_VALUE;
        final byte b3 = Byte.MIN_VALUE;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
