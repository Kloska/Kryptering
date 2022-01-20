package com.company;

public class Crypt {
    public static void main(String[] args) {
        exempel1();
        exempel2();
        exempel3();
    }

    // Visar hur exemplet i teorigenomgången funkar i Java
    private static void exempel1() {
        String message = "HEJ";
        char key = '(';
        String crypt = "";

        for (int i = 0 ; i < message.length() ; i++) {
            System.out.println(Integer.toBinaryString(message.charAt(i)));
            System.out.println("0" + Integer.toBinaryString(key));
            System.out.println(Integer.toBinaryString(message.charAt(i)^key));
            System.out.println((message.charAt(i)^key) + "\n");
            crypt += (char)(message.charAt(i)^key);
        }
        System.out.println(crypt);
    }

    // Visar hur XOR-kryptering funkar på byte-nivå
    public static void exempel2() {
        byte A = 72;
        byte B = 40;
        // måste casta till byte eftersom det alltid blir en int
        byte C = (byte)(A^B);
        System.out.println(A + "^" + B + "=" +C);
    }

    // Visar hur XOR-kryptering funkar på char-nivå
    public static void exempel3() {
        char m = 'H';
        char k = '(';
        // måste casta till char eftersom det alltid blir en int
        char c = (char)(m^k);
        System.out.println(m + "^" + k + "=" + c);
    }
}